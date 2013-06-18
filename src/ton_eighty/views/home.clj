(ns ton-eighty.views.home
  (:use
        [hiccup.core :only (h)]
        [hiccup.form :only (form-to label text-field select-options)]
        [clojure.string :only (lower-case)])
  (:require [ton-eighty.views.layout :as layout]))

(defn index [req]
  (layout/common req "TON EIGHTY" [:div {:class "header"} "Ton Eighty"]))

(defn- game-select [game-name]
  "individual game select button in bootstrap style"
  (let [id (lower-case game-name)]
    [:button {:type "button" :class "btn btn-primary"} game-name]))

(defn games [games]
  "create the radio button group in bootstrap style"
  [:div {:class "control-group" :data-toggle "buttons-radio"}
   [:label {:class "control-label"} "Type"]
   [:div {:class "controls btn-group"} (map game-select games)]])


(defn submit-button [label]
  "create a bootstrap styled submit button"
  [:div {:class "control-group"}
   [:div {:class "controls"}
    [:button {:type "submit" :class "btn"} label]]])

(defn score-input
  "creates a labeled score input field"
  [label id]
  (let [score-id (str id "-score")
        place-id (str id "-place")]
    [:div {:class "row-fluid"}
     [:div {:class "span4"}
      [:label {:for id} label]
      [:div (text-field id)]]
     [:div {:class "span2"}
      [:label {:for score-id} "Score"]
      (text-field {:class "input-mini"} score-id)]
     [:div {:class "span1"}
      [:label {:for place-id} "Place"]
      [:select {:class "input-mini"} (select-options [1 2 3])]]]))

(defn game-form []
   [:div {:id "game-form"}
    (form-to [:post "/game"]
             [:h3 "Game"]
             (games ["Cricket" "301" "601"])
             (score-input "Player 1" "p1")
             (score-input "Player 2" "p2")
             (score-input "Player 3" "p3")
             (submit-button "Record"))])

(defn game [req]
  (layout/common req "TON EIGHTY" [:div {:class "header"} (game-form)]))

