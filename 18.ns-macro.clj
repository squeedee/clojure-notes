(ns ns-macro
  (:require [clojure.string :as s]
            [clojure.data :as data])
  (:use [clojure.contrib.json :only (json-str pprint-json)]
        [clojure.contrib.greatest-least :only (greatest least)]))

(data/diff [1 2 3] [1 7 3 4])
(diff [1 2 3] [1 7 3 4])

(s/capitalize "hello")
