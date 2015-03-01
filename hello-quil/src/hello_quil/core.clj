(ns hello-quil.core)
(use 'quil.core)

(defn foo []
	(sketch 
		:setup (fn [] 
			(background 20) 
			(ellipse 50 50 80 80)) 
		:title "The moon delights the night"))

(defn -main [] (foo))
