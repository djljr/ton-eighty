(ns ton-eighty.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring])
  (:require [compojure.route :as route]
            [cemerick.friend :as friend]
            [cemerick.friend.openid :as openid]
            [compojure.handler :as handler]
            [ton-eighty.controllers.home :as home]
            [ton-eighty.views.layout :as layout]))

(defroutes routes
  home/routes
  (route/resources "/")
  (route/not-found (layout/four-oh-four)))

(def application (handler/site
                  (friend/authenticate
                   routes
                   {:allow-anon? true
                    :default-landing-uri "/"
                    :workflows [(openid/workflow
                                 :openid-uri "/login"
                                 :credential-fn identity)]})))

(defn start [port]
  (run-jetty application {:port port :join? false}))

(defn -main []
  (let [port (Integer/parseInt
              (or (System/getenv "PORT") "8000"))]
    (start port)))
