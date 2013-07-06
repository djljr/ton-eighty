(ns ton-eighty.controllers.home
  (:use [compojure.core :only (defroutes GET POST)])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            [ton-eighty.views.home :as home]
            [ton-eighty.views.game :as game]
            [ton-eighty.views.practice :as practice]))

(defn index [req]
  (home/index req))

(defn game [req]
  (game/index req))

(defn practice [req]
  (practice/index req))

(defroutes routes
  (GET "/" req (index req))
  (GET "/game" req (game req))
  (GET "/practice" req (practice req)))