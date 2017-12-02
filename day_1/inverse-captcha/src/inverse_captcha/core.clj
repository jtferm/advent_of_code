(ns inverse-captcha.core
  (:gen-class))

(import java.lang.Character)

(defn matching-values
  [x y]
  (if (= x y)
    x
    0))

(defn sum-matching-nth
  [offset numbers]
  (let [nexts (nthrest (cycle numbers) offset)]
    (reduce + (map matching-values numbers nexts))))

(def sum-matching-next (partial sum-matching-nth 1))

(defn sum-matching-halfway-around
  [numbers]
  (sum-matching-nth (/ (count numbers) 2) numbers))

(defn char-to-digit
  [ch]
  (java.lang.Character/digit ch 10))

(defn -main
  [& args]
  (println (sum-matching-halfway-around (map char-to-digit (seq (first args))))))
