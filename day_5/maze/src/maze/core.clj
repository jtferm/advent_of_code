(ns maze.core
  (:gen-class))

(require ['clojure.string :as 'string])

(defn parse-input
  [row]
  (vec (map read-string (string/split row #"\s+"))))

(defn jump
  [instructions offset]
  (let [jump (get instructions offset)
        destination (+ offset jump)]
    (if (< destination (count instructions))
      [(assoc instructions offset (+ jump 1)) destination]
      nil)))

(defn jump-wrapper
  [pair]
  (let [instructions (pair 0) offset (pair 1)] (jump instructions offset)))

(defn compute-jumps
  [instructions]
  (count (take-while some? (iterate jump-wrapper [instructions 0]))))

(defn -main
  [& args]
  (println (compute-jumps (parse-input (string/join args)))))
