(ns proj.activity
  (:import
    (myjava Activity)
    )
  (:gen-class
    :name "proj.activity.MyActivity"
    :extends myjava.Activity
    :exposes-methods {mymethod supermymethod}
    ))

(defn -mymethod [this]
  (.supermymethod this)
  (println "hello")
  )
