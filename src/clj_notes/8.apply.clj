(ns invoking-functions-by-ref)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Invoking functions by reference
;;

(let [numbers `(1 2 3)]
  (apply + numbers))
;; -> 6

(defn one-two-and-more [f]
  (let [a 1
        b 2
        more '(3 4)]
    (apply f a b more)))

(one-two-and-more println)
;; -> 1 2 3 4

(one-two-and-more +)
;; -> 10

(one-two-and-more *)
;; -> 24


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variadic apply
;;

;; Compare this (from 7.params-and-arity)
  (defn messenger-orig [greeting & who]
    (println greeting who))

  (messenger-orig "Hello" "world" "class")
  ;; -> Hello (world class)

;; To this
  (defn messenger-apply [greeting & who]
    (apply println greeting who)) ;; Using apply

  (messenger-apply "Hello" "world" "class")
  ;; -> Hello world class

