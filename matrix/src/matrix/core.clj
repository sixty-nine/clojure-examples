(ns matrix.core
	(:refer-clojure :exclude [* - + == /])
	(:require [clojure.core.matrix :refer :all]
	[clojure.core.matrix.operators :refer :all]))

(defn -main [] 
	(def proj (matrix [
		[1   1   2] 
		[-2  2   1]
		[0   0   0]]))
	(def v (matrix [1 1 ]))

	(pm v)
	(pm proj)
	(pm (mmul proj v))

	)
