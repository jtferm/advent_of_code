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
  (let [nexts   (conj (subvec numbers 1) (first numbers))
        matches (map matching-values numbers nexts)]
    (reduce + matches)))

(defn char-to-digit
  [ch]
  (java.lang.Character/digit ch 10))

(defn foo
  [input]
  (vec (map char-to-digit (seq input))))

(defn -main
  [& args]
  (println (sum-same (foo (first args)))))
