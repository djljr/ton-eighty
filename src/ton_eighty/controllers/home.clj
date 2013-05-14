(ns ton-eighty.controllers.home
  (:use [compojure.core :only (defroutes GET POST)])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            [ton-eighty.views.home :as view]))

(defn index []
  (view/index))

(defn game []
  (view/game))

(defroutes routes
  (GET "/" [] (index))
  (GET "/games" [] (game)))