(ns inverse-captcha.core-test
  (:require [clojure.test :refer :all]
            [inverse-captcha.core :refer :all]))

(deftest sum-same-test
  (testing "Tests that sum-same returns the sum of numbers that are the same as the next number"
    (is (= (sum-same [1 1 2 2]) 3))
    (is (= (sum-same [1 1 1 1]) 4))
    (is (= (sum-same [1 2 3 4]) 0))
    (is (= (sum-same [9 1 2 1 2 1 2 9]) 9))))
