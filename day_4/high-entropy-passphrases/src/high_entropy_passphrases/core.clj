(ns high-entropy-passphrases.core
  (:gen-class))

(require ['clojure.string :as 'string])

(defn parse-row
    [row]
      (map read-string (string/split row #"\s+")))

(defn parse-input
    [input]
      (map parse-row (string/split-lines input)))

(defn check-unique-words
  [words]
  (let [sorted-words (map sort (map str words))
        unique (set sorted-words)]
    (== (count words) (count unique))))

(defn count-unique-inputs
  [passphrases]
  (count (filter identity (map check-unique-words passphrases))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (count-unique-inputs (parse-input (first args)))))
