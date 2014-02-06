;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Load
;;

(require 'clojure.set)
; -> nil
; why? because it has a side effect. functions with side effects idiomattically return nil

; Must fully qualify
(clojure.set/union #{1 2} #{2 3 4 5})


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Load with Aliasing
;;

(require '[clojure.set :as s])

(s/union #{1 2} #{2 3 4 5})

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Reload
;;

;; Reloads dependent file/namespace
(use 'clojure.string :reload)

;; Reloads dependent file/namespace and it's children
;; but not it's children's chidren
(use 'clojure.string :reload-all)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Load with Use
;;

;; warns on clashes
(use 'clojure.string)
; -> WARNING: replace already refers to: #'clojure.core/replace in namespace: user, being replaced by: #'clojure.string/replace

(replace "Rama Rama Rama" "R" "L")
; -> Lama Lama Lama

(use '[clojure.string :only (join)]) ;; does not clash

(join "," ["a" "b" "c"])
; -> "a,b,c"
