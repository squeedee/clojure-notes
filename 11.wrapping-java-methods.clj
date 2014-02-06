(ns wrapping-java-methods)
(require 'clojure.string)

;; greeting accepts a name, or a name and a transform function
(defn greeting
  ([name] (str "Hello " name "!"))
  ([name transform] (transform (greeting name))))

;; calling greeting
(greeting "Joseph")
; -> Hello Joseph!

;; use java.String#toUpperCase to transform
(defn upcase-transform [str]
  (.toUpperCase (String. str)))

(greeting "Joseph" upcase-transform)
; -> HELLO JOSEPH!


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; terse helper macros
;;

(greeting "Joseph" #(.toUpperCase (String. %)))

