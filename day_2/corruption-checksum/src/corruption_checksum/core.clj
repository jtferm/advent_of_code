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

(defn fancy-divide
  [x y]
  (let [larger  (max x y)
        smaller (min x y)]
    (if (= 0 (mod larger smaller))
      (/ larger smaller)
      0)))

(defn row-quotient
  [values]
  (let [row-value (reduce + (map (partial fancy-divide (first values)) (rest values)))]
    (if (< 0 row-value)
      row-value
      (recur (rest values)))))

(defn spreadsheet-checksum-division
  [input]
  (reduce + (map row-quotient (parse-input input))))

(defn -main
  [& args]
  (println (spreadsheet-checksum-division (first args))))
