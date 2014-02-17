(ns terse-helper-macros)

(#(apply + %1 %2 %& ) 1 2 3 4)
; -> 10
