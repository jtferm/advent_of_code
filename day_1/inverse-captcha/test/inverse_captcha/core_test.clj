(ns inverse-captcha.core-test
  (:require [clojure.test :refer :all]
            [inverse-captcha.core :refer :all]))

(deftest sum-matching-next-test
  (testing "Tests that sum-matching-next returns the sum of numbers that are the same as the next number"
    (is (= (sum-matching-next [1 1 2 2]) 3))
    (is (= (sum-matching-next [1 1 1 1]) 4))
    (is (= (sum-matching-next [1 2 3 4]) 0))
    (is (= (sum-matching-next [9 1 2 1 2 1 2 9]) 9))))

(deftest sum-matching-halfway-around-test
  (testing "Tests that sum-matching-halfway-around returns the sum of numbers that are the same as the next number"
    (testing "Tests sum-matching-halfway-around returns the sum of numbers by offset"
      (is (= (sum-matching-halfway-around [1 2 1 2]) 6))
      (is (= (sum-matching-halfway-around [1 2 2 1]) 0))
      (is (= (sum-matching-halfway-around [1 2 3 4 2 5]) 4))
      (is (= (sum-matching-halfway-around [1 2 3 1 2 3]) 12))
      (is (= (sum-matching-halfway-around [1 2 1 3 1 4 1 5]) 4)))))
