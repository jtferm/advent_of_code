(ns corruption-checksum.core
  (:gen-class))

(require ['clojure.string :as 'string])

(defn parse-row
  [row]
  (map read-string (string/split row #"\s+")))

(defn parse-input
  [input]
  (map parse-row (string/split-lines input)))

(defn row-diff
  [values]
  (let [mn (apply min values)
        mx (apply max values)]
    (- mx mn)))

(defn spreadsheet-checksum
  [input]
  (reduce + (map row-diff (parse-input input))))

(defn -main
  [& args]
  (println (spreadsheet-checksum (first args))))
