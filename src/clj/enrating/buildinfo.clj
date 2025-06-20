(ns enrating.buildinfo
  (:require [clojure.java.shell :as sh]
            [clojure.string :as str])
  (:import (java.time Instant)))

(defn git-current-sha []
  (let [{:keys [exit out]} (sh/sh "git" "rev-parse" "HEAD")]
    (if (= 0 exit)
      (str/trim out)
      nil)))

(defn git-dirty? []
  (let [{:keys [exit out]} (sh/sh "git" "status" "--short")]
    (if (= 0 exit)
      (not (str/blank? (str/trim out)))
      true)))

(defn git-commit-instant [commitish]
  (let [{:keys [exit out]} (sh/sh "git" "log" "-1" "--format=%at" commitish)]
    (if (= 0 exit)
      (Instant/ofEpochSecond (Long/parseLong (str/trim out)))
      true)))

(defn get-current-build-info []
  (try
    (let [commit (git-current-sha)]
      {:short-sha (subs commit 0 7)
       :long-sha  commit
       :instant   (git-commit-instant commit)
       :dirty?    (git-dirty?)
       })
    (catch Exception e
      nil)))

(def git-repo-url "https://github.com/shilder/enduro-rating")

(defn format-commit-url
  [sha]
  (str git-repo-url "/commit/" sha))
