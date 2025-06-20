(ns enrating.buildinfo
  (:require [clojure.java.shell :as sh]
            [clojure.string :as str]))

(defn git-current-sha [short?]
  (let [{:keys [exit out]} (sh/sh "git" "rev-parse" "HEAD")]
    (if (= 0 exit)
      (let [sha (str/trim out)]
        (if short?
          (subs sha 0 7)
          sha)
        )
      nil)))

(defn git-dirty? []
  (let [{:keys [exit out]} (sh/sh "git" "status" "--short")]
    (if (= 0 exit)
      (not (str/blank? (str/trim out)))
      true)))

(defn get-current-build-info []
  (try
    {:short-sha (git-current-sha true)
     :long-sha  (git-current-sha false)
     :dirty?    (git-dirty?)}
    (catch Exception e
      nil)))

(def git-repo-url "https://github.com/shilder/enduro-rating")

(defn format-commit-url
  [sha]
  (str git-repo-url "/commit/" sha))
