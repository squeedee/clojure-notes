(ns namespace-scopes)

;; In a namspaces scope
;; * Vars
;; * keywords
;; * Java Type Names

;; In local scope
;; * Function arguments
;; * let
;; * vars, keywords, java type names declared in the namespaces

(ns namespace-scopes.foo)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Vars
;;

;; Creates a Var:

(defn hello [who] (println (str "Hello " who "!")))

;; which can be referenced as
(namespace-scopes.foo/hello "Jack") ; qualified-name

; -> Hello Jack!

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Keywords
;;

:keyword ; global

::keyword ; reference as :namescape-scopes.foo/keyword

