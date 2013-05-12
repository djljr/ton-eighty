(ns ton-eighty.views.home
  (:use [hiccup.core :only (h)])
  (:require [ton-eighty.views.layout :as layout]))

(defn index []
  (layout/common "TON EIGHTY" [:div {:class "header"} "Ton Eighty"]))

(defn game []
  (layout/common "TON EIGHTY" [:div {:class "header"} "Game"]))