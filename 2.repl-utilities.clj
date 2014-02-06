(ns repl-utilities)

(use 'clojure.repl)

(doc when) ; Doc for var. ctrl-d in LT
(find-doc "sequence") ; Search. Ctrl-Shift-D in LT
(apropos "map") ; Just definitions including the name
(source take) ; View source. Ctrl-. jumps to definition if it can find it.
(dir clojure.repl) ; definitions in a namespace
