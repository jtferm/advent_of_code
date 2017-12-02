(ns corruption-checksum.core-test
  (:require [clojure.test :refer :all]
            [corruption-checksum.core :refer :all]))

(deftest spreadsheet-checksum-test
  (testing "FIXME, I fail."
    (let [input "5 1 9 5\n7 5 3\n2 4 6 8"]
      (is (= 18 (spreadsheet-checksum input))))))
