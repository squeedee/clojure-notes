(ns params-and-arity)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Differing arity multi-arity-functions
;;

(defn messenger
  ;; no args, call self with a default
  ([] (messenger "Hello World!"))
  ([msg] (println msg)))

(messenger)
;; -> Hello World!

(messenger "How you doin?")
;; -> How you doin?

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variadic functions
;;

(defn messenger [greeting & who]
  (println greeting who))

(messenger "Hello" "world" "class")
;; -> Hello (world class)
