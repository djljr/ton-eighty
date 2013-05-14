(ns ton-eighty.views.home
  (:use [hiccup.core :only (h)]
        [hiccup.form :only (form-to label text-field radio-button submit-button)]
        [clojure.string :only (lower-case)])
  (:require [ton-eighty.views.layout :as layout]))

(defn index []
  (layout/common "TON EIGHTY" [:div {:class "header"} "Ton Eighty"]))

(defn- game-select [game-name]
  (let [id (lower-case game-name)]
    [:button {:type "button" :class "btn btn-primary"} game-name]))

(defn games [games]
  [:div {:class "btn-group" :data-toggle "buttons-radio"}
   (map game-select games)])

(defn game-form []
  [:div {:id "game-form" :class "span10"}
   (form-to [:post "/game"]
            [:h3 "Game"]
            (games ["Cricket" "301" "601"])
            (label "p1" "Player 1")
            (text-field "p1")
            (label "p2" "Player 2")
            (text-field "p2")
            (submit-button "Record"))])

(defn game []
  (layout/common "TON EIGHTY" [:div {:class "header"} (game-form)]))

