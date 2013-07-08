(ns ton-eighty.views.practice
  (:use
        [hiccup.core :only (h)]
        [hiccup.form :only (form-to label text-field select-options)]
        [clojure.string :only (lower-case)])
  (:require [ton-eighty.views.layout :as layout]))

(defn one-two-or-three []
  "show 1 2 3 as a radio select to decide how many darts hit the target"
  (let [button (fn [num] [:button {:type "button" :class "btn primary"} (str num)])]
   [:div {:class "control-group" :data-toggle "buttons-radio"}
    [:label {:class "control-label"} "Hit"]
    [:div {:class "controls btn-group"} (map button [1 2 3])]]))

(defn- board-section-button [cnt number]
  [:div {:class "row"}
   [:div {:class "span1"}
    [:button (str cnt number)]]])

(defn- board-section [number]
  [:div {:class (str "section-" number)}
   (board-section-button "D" number)
   (board-section-button "F" number)
   (board-section-button "T" number)
   (board-section-button "S" number)])

(defn board []
  "draw a board out of buttons"
  [:div {:class "board"}
   (board-section 20)
   (board-section 1)
   (board-section 18)
   (board-section 4)
   (board-section 13)
   (board-section 6)
   (board-section 10)
   (board-section 15)
   (board-section 2)
   (board-section 17)
   (board-section 3)
   (board-section 19)
   (board-section 7)
   (board-section 16)
   (board-section 8)
   (board-section 11)
   (board-section 14)
   (board-section 9)
   (board-section 12)
   (board-section 5)])

(defn index [req]
  (layout/common req "TON EIGHTY" (board)))