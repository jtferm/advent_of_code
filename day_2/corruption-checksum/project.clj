(defproject corruption-checksum "0.1.0-SNAPSHOT"
  :description "Day 2 of Advent of Code 2017"
  :url "https://github.com/jtferm/advent_of_code/day_2"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/tools.cli "0.3.5"]]
  :main ^:skip-aot corruption-checksum.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-cljfmt "0.5.7"]])
