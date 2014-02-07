(ns my-namespace)

;; Import java.io.FileReader and java.io.File into this namespace
;; * Cannot alias or rename the class
;; * cannot import '*'
(import (java.io FileReader File))
