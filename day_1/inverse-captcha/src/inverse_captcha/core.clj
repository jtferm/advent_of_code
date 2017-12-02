(ns inverse-captcha.core
  (:require [clojure.tools.cli :refer [parse-opts]])
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

(def cli-options
  [["-h" "--halfway"]])

(defn -main
  [& args]
  (let [{:keys [options arguments]} (parse-opts args cli-options)
        digits (map char-to-digit (seq (first arguments)))]
    (println
     (if (options :halfway)
       (sum-matching-halfway-around digits)
       (sum-matching-next digits)))))
