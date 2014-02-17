(def has-meta (with-meta [1 2 3] {:example true}))

(eval has-meta)
(meta has-meta)

