(ns maze.core-test
  (:require [clojure.test :refer :all]
            [maze.core :refer :all]))

(deftest a-test
  (testing "compute-jumps"
    (is (= 5 (compute-jumps [0 3 0 1 -3])))))
