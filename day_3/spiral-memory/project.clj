(defproject spiral-memory "0.1.0-SNAPSHOT"
  :description "Day 3 of Advent of Code 2017"
  :url "https://github.com/jtferm/advent_of_code/day_3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :main ^:skip-aot spiral-memory.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-cljfmt "0.5.7"]])
