(ns corruption-checksum.core-test
  (:require [clojure.test :refer :all]
            [corruption-checksum.core :refer :all]))

(deftest spreadsheet-checksum-test
  (testing "Top level standard spreadsheet checksum test"
    (let [input "5 1 9 5\n7 5 3\n2 4 6 8"]
      (is (= 18 (spreadsheet-checksum input))))))

(deftest spreadsheet-checksum-division-test
  (testing "Test dividing the two evenly divisible numbers per row"
    (let [input "5 9 2 8\n9 4 7 3\n3 8 6 5"]
      (is (= 9 (spreadsheet-checksum-division input))))))

(deftest row-quotient-test
  (testing "Find the two numbers that evenly divide, and divide them"
    (is (= 4 (row-quotient [5 9 2 8])))
    (is (= 3 (row-quotient [9 4 7 3])))
    (is (= 2 (row-quotient [3 8 6 5])))))
