(ns enrating.cli
  (:require [ns-tracker.core :as nt]
            [nrepl.server :as server]
            [nrepl.cmdline]))

;; Auto-reload for changes in data - will regenerate pages on every change

(def modified-namespaces
  (nt/ns-tracker ["src"]))

(defn auto-reload-loop []
  (require 'enrating.core)
  (println "Watching for changes")
  (loop []
    (doseq [ns-sym (modified-namespaces)]
      (try
        (println "Reloading" ns-sym)
        (require ns-sym :reload)
        (catch Exception e
          ;; TODO: ANSI color code
          (println "ERROR" (ex-message (ex-cause e))))))
    (Thread/sleep 1000)
    (recur)))

(defn start-auto-reload []
  (println "Starting auto-reload thread")
  (let [thread (Thread. (fn []
                          (auto-reload-loop)))]
    (.start thread)
    thread))

(defn start [& args]
  (println "Starting nREPL")
  ;; TODO: nREPL port file
  (let [server (server/start-server)]
    (println "nREPL started on port" (:port server))
    (nrepl.cmdline/save-port-file server {}))
  (auto-reload-loop))
