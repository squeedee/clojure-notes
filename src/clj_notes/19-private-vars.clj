(ns private-vars)

(defn pub-add [& coll] (apply + coll))
(defn ^:private priv-add [& coll] (apply + coll))

(pub-add 1 2 3)
(priv-add 1 2 3)

(ns different-ns)

(private-vars/pub-add 1 2 3)

(private-vars/priv-add 1 2 3) ; Exception
