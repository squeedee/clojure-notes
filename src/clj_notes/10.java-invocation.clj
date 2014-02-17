(ns java-invokation)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Instantiation
;;

; new String("hello")
(String. "hello")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Instance method
;;

; (new String("hello")).toLowerCase
(.toLowerCase (String. "HELLO"))
; -> "hello"

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Field access
;;

; String.new("Hello").-field
(.-field (String. "Hello")) ; Not going to work as string has no field

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Static methods
;;

; Math.sqrt(25)
(Math/sqrt 25)
; -> 5.0

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Static Field
;;

; Math.PI
(Math/PI )
; -> 3.1415...

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Fluent or chained access
;;

; person.getAddress().getZipCode
(.getZipCode (.getAddress person)) ; naive

(.. person getAdress getZipCode) ; ordered

