(ns proj.core
  (:import
    (myjava Activity)
    )
  (:gen-class
    :name "proj.core.MyActivity"
    :extends myjava.Activity
    ))

(defn -mymethod [this]
  (println "hello")
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (doto (proj.core.MyActivity.) .mymethod)
  (println "Hello, World!"))
