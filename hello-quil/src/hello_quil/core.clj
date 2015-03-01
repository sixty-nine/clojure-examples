(ns hello-quil.core
	(:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/frame-rate 10)
  (q/background 255)            
  (q/fill 0)     
  (q/text-font (q/create-font "DejaVu Sans" 48 true)))

(defn draw []
  (q/text "Hello Quil" (/ (q/width) 3) (/ (q/height) 2)))


(defn foo []
	(q/defsketch example                  ;; Define a new sketch named example
	  :title "Hello Quil"    ;; Set the title of the sketch
	  :setup setup                        ;; Specify the setup fn
	  :draw draw                          ;; Specify the draw fn
	  :size [800 600]) 
)

(defn -main [] (foo))
