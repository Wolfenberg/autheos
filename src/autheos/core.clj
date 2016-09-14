(ns autheos.core
  (:require [mikera.image.core :as i]
            [mikera.image.filters :as f]
            [mikera.image.spectrum ]))


(let [image (i/load-image "banana.bmp")]
  (i/show (i/resize ((f/grayscale) image) 20 20)))
