(ns ton-eighty.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring]))

(defroutes routes
  (GET "/" [] "<h2>Hello World</h2>"))

(defn -main []
  (run-jetty routes {:port 8000 :join? false}))