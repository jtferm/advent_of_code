(ns spiral-memory.core
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn center
  [side corner]
  (- corner (/ side 2)))

(defn corner
  [square side_length side_num]
  (- square (* side_length side_num)))

(defn corners
  [side square]
  (map (partial corner square side) (range 4)))

(defn centers
  [sqrt]
  (let [sqr (* sqrt sqrt)
        side (- sqrt 1)]
    (map (partial center side) (corners side sqr))))

(defn center-distance
  [address center]
  (math/abs (- address center)))

(defn center-distances
  [address cntrs]
  (map (partial center-distance address) cntrs))

(defn distance
  [address sqrt]
  (+ (math/floor (/ sqrt 2)) (apply min (center-distances address (centers sqrt)))))

(defn spiral-memory-retrieval-distance
  [address]
  (let [sqrt (math/sqrt address)
        sqrt_ceil (int (math/ceil sqrt))]
    (if (== 1 (mod sqrt_ceil 2))
      (distance address sqrt_ceil)
      (distance address (+ 1 sqrt_ceil)))))
