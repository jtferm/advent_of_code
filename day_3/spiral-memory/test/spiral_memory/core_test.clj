(ns spiral-memory.core-test
  (:require [clojure.test :refer :all]
            [spiral-memory.core :refer :all]))

(deftest spiral-test
  (testing "Spiral memory retrieval manhattan distance"
    (is (== 0 (spiral-memory-retrieval-distance 1)))
    (is (== 3 (spiral-memory-retrieval-distance 12)))
    (is (== 2 (spiral-memory-retrieval-distance 23)))
    (is (== 31 (spiral-memory-retrieval-distance 1024)))
    (testing "centers"
      (is (= '(8 6 4 2) (centers 3))))
    (testing "center-distances"
      (is (= '(1 1 3 5) (center-distances 7 (centers 3))))
      (is (= '(0 2 4 6) (center-distances 8 (centers 3)))))))
