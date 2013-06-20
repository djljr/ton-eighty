(ns ton-eighty.controllers.home
  (:use [compojure.core :only (defroutes GET POST)])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            [ton-eighty.views.home :as view]))

(defn index [req]
  (view/index req))

(defn game [req]
  (view/game req))

(defroutes routes
  (GET "/" req (index req))
  (GET "/game" req (game req)))