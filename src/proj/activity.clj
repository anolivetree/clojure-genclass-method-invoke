(ns proj.activity
  (:import
    (myjava Activity)
    )
  (:gen-class
    :name "proj.activity.MyActivity"
    :extends myjava.Activity
    :exposes-methods {mymethod super-mymethod}
    ))

(defn -mymethod [this]
  (.super-mymethod this)
  (println "hello")
  )
