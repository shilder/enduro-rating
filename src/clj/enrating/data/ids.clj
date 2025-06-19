(ns enrating.data.ids
  (:require [clojure.string :as str]))

(defonce random (java.util.Random.))

(defn generate-id [length]
  (let [bytes (byte-array length)
        _ (.nextBytes random bytes)
        encoder (java.util.Base64/getUrlEncoder)]
    (str/replace (.encodeToString encoder bytes) #"(=|-|_)" "")))

(defn rider-id []
  (str "R" (generate-id 5)))

(defn event-id []
  (str "E" (generate-id 4)))

(defn classification-id []
  (str "C" (generate-id 8)))

(defn result-id []
  (str "S" (generate-id 10)))

(comment
  (take 10 (repeatedly rider-id))
  (take 10 (repeatedly event-id))
  (take 10 (repeatedly classification-id)))
