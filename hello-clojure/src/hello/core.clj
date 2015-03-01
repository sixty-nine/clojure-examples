(ns hello.core (:gen-class))

(defn hello [name] (str "Hello " name))

(defn -main [] (println (hello "Clojure")))
