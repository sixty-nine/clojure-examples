(ns quil-psychedelic.core
	(:require [quil.core :as q]))

(def width 300)
(def half-width (/ width 2))

(defn setup []
  (q/smooth)                          ;; Turn on anti-aliasing
  (q/frame-rate 10))
                                      ;; a nice shade of grey.
(defn draw []
  (q/background (q/random 255))
  (q/stroke (q/random 255))             ;; Set the stroke colour to a random grey
  (q/stroke-weight 1)       ;; Set the stroke thickness randomly
  (q/fill (q/random 255))               ;; Set the fill colour to a random grey

  (q/with-translation [width width]
    (q/with-rotation [(q/random q/PI)]
      (q/begin-shape)
      (q/vertex (- half-width) half-width)
      (q/vertex half-width half-width)
      (q/vertex half-width (- half-width))
      (q/vertex (- half-width) (- half-width))
      (q/end-shape :close))))

(defn foo []
	(q/defsketch example                  
	  :title "Grey psychedelic"    
	  :setup setup                        
	  :draw draw                          
	  :size [600 600])   
)

(defn -main [& args] (foo))