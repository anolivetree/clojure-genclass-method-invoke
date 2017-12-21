(defproject proj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main proj.core
  :target-path "target/%s"
  :aot [proj.core, proj.activity]
  :resource-paths ["lib/ver1.jar"]                          ;; compile against ver2
  :profiles {:uberjar {:aot :all}})
