(ns proj.core
  (:require proj.activity)
  (:gen-class
    ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (doto (proj.activity.MyActivity.) .mymethod))
