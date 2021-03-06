(defproject playground "0.1.0-SNAPSHOT"
  :description "Playing with clojure on AWS Lambda using SAM"
  :url "https://github.com/sideshowcoder/aws-sam-clojure-playground"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/data.json "0.2.6"]
                 [ring "1.6.3"]
                 [compojure "1.6.1"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]]
  :repl-options {:init-ns playground.core}
  :profiles {:uberjar {:aot :all}})
