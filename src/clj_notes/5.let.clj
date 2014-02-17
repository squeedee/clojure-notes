(ns lets)

(require '[clojure.string :as string])

(defn messenger [msg]
  (let [a 7
        b 6
        cap-msg (string/capitalize msg)]
    (println msg)
    (println a)
    (println b)))

