(defproject ton-eighty "0.1.0"
  :description "Darts webapp to keep scores and standings"
  :url "http://github.com/djljr/ton-eighty"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.0-alpha3"]
                 [postgresql "9.1-901.jdbc4"]
                 [ring/ring-jetty-adapter "1.1.8"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]]
  :plugins [[lein-ring "0.8.5"]]
  :main ton-eighty.core)
