(defproject ton-eighty "0.1.0"
  :description "Darts webapp to keep scores and standings"
  :url "http://github.com/djljr/ton-eighty"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.0-alpha3"]
                 [postgresql "9.1-901.jdbc4"]
                 [ring/ring-jetty-adapter "1.2.0-RC1"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]
                 [prismatic/dommy "0.1.1"]]
  :plugins [[lein-ring "0.8.5"]
            [lein-cljsbuild "0.3.2"]]
  :ring {:handler ton-eighty.core/routes}
  :cljsbuild {
              :builds [{
                        :source-paths ["src/cljs"]
                        :compiler {
                                   :output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :main ton-eighty.core)
