(ns foo)

(def a "this is foo a")
; -> foo/a

a
; -> this is foo a

(ns bar)

a ; unresolved symbol

(in-ns 'foo)

a
; -> this is foo a
