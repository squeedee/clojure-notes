(ns ns-macro
  (:require [clojure.string :as s]
            [clojure.data :as data])
  (:use [clojure.contrib.greatest-least :only (greatest least)])
  (:import (java.net URL URI)))

(data/diff [1 2 3] [1 7 3 4])

(s/capitalize "hello")

(greatest 1 2)
(least 1 2)

(URL. "https://example.com")
(URI. "https://example.com")
