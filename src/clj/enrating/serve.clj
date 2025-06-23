(ns enrating.serve
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [org.httpkit.server :as server])
  (:import (java.net NetworkInterface)))

;; ChatGPT-produced - looks correct
(defn get-ip-addresses []
  (->> (enumeration-seq (NetworkInterface/getNetworkInterfaces))
       (filter #(.isUp %))
       (mapcat #(enumeration-seq (.getInetAddresses %)))
       (remove #(or (.isLoopbackAddress %)
                    (.isLinkLocalAddress %)
                    (.isMulticastAddress %)))
       (map #(.getHostAddress %))
       distinct))

(defn start [& args]
  (let [port 8151]
    (server/run-server
      (fn [request]
        (let [resfile (io/file "generated/result.html")
              page (slurp resfile)]
          {:status  200
           :body    page
           :headers {"Context-Type"   "text/html"
                     "Content-Length" (.length resfile)}}))
      {:port port})
    (println "Server started at"
             (str/join ", "
                       (map (fn [ip] (str "http://" ip ":" port "/"))
                            (get-ip-addresses))))))
