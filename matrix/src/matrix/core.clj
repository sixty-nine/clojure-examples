(ns matrix.core
	(:refer-clojure :exclude [* - + == /])
	(:require [clojure.core.matrix :refer :all]
	[clojure.core.matrix.operators :refer :all]
	[clatrix.core :as cl]
	))

(defn -main [] 
	(def proj (cl/matrix [
		[1   1   2] 
		[-2  2   1]
		[0   0   0]]))
	(def v (cl/matrix [1 1 1]))

	(println "Vector")
	(pm v)
	(println "Projection matrix")
	(pm proj)
	(println "Projected vector")
	(pm (mmul proj v))

	)
