(ns hello.test.core
  (:use [hello.core])
  (:use [clojure.test]))

(deftest hello-test
	(is (= "Hello Clojure" (hello "Clojure")) "It properly says hello"))
