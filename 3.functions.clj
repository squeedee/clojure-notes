(ns functions)

; Pure functions have no side effects.

(fn [message] (print message)) ; fn returns a compiled function
; first argument is the params Vector
; second argument is the body

; Anonymous functions can be evaluated in an expression
((fn [message] (print message)) "hi")

; Function bodies can have many expressions
((fn [name]
   (print "Hi ")
   (print name) (print "\n"))
 "Joe")

; using def

(def print-hi
  (fn [name]
    (print "Hi ")
    (print name)
    (print "\n")))

(print-hi "Ted")

; using defn

(defn print-bye [name]
  (print "Bye ")
  (print name)
  (print "\n"))

(print-bye "Ted")

