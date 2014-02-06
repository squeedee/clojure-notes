(ns closures)

(defn messenger-builder [greeting]
  (fn [who] (print greeting who))) ; closes over greeting

;; greeting is provided here, and then goes out fo scope
(def hello-er (messenger-builder "Hello"))

;; greeting still available because hello-er is a function closed
;; over the greeting "Hello"
(hello-er "world!")
;; -> Hello world!
