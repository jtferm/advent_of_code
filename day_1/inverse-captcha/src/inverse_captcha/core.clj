(ns inverse-captcha.core
  (:gen-class))

(import java.lang.Character)

(defn matching-values
  [x y]
  (if (= x y)
    x
    0))

(defn sum-same
  [numbers]
  (let [nexts (rest (cycle numbers))]
    (reduce + (map matching-values numbers nexts))))

(defn char-to-digit
  [ch]
  (java.lang.Character/digit ch 10))

(defn -main
  [& args]
  (println (sum-same (map char-to-digit (seq (first args))))))
