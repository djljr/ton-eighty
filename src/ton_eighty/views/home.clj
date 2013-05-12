(ns ton-eighty.views.home
  (:use [hiccup.core :only (h)]
        [hiccup.form :only (form-to label text-field submit-button)])
  (:require [ton-eighty.views.layout :as layout]))

(defn index []
  (layout/common "TON EIGHTY" [:div {:class "header"} "Ton Eighty"]))

(defn game-form []
  [:div {:id "game-form" :class "span10"}
   (form-to [:post "/game"]
            (label "Player 1" "Player 1")
            (text-field "p1")
            (submit-button "Record"))])

(defn game []
  (layout/common "TON EIGHTY" [:div {:class "header"} (game-form)]))

