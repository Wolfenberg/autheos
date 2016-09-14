(ns autheos.core
  (:require [mikera.image.core :as i]
            [mikera.image.filters :as f]
            [mikera.image.spectrum ]))


(defn image-bytes
  "Loads an image and returns an int array"
  [path]
  (-> (i/load-image path)
      ((f/grayscale))
      (i/resize 20 20)
      (i/get-pixels)))

(let [image (i/load-image "banana.bmp")]
  (apply max (vec (i/get-pixels (i/resize ((f/grayscale) image) 20 20)))))
