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

(defn- board-section-button [cnt number cssClass]
  [:div {:class "row"}
   [:div {:class "span1"}
    [:button {:class cssClass} (str cnt number)]]])

(defn- board-section [number cssClass]
  [:div {:class (str "section-" number " " cssClass)}
   (board-section-button "D" number (str cssClass " small"))
   (board-section-button "F" number (str cssClass " big"))
   (board-section-button "T" number (str cssClass " small"))
   (board-section-button "S" number (str cssClass " big"))])

(defn- board-section-dark [number]
  (board-section number "dark"))

(defn- board-section-light [number]
  (board-section number "light"))

(def section-order (apply map list (partition 2 [20 1 18 4 13 6 10 15 2 17 3 19 7 16 8 11 14 9 12 5])))

(defn board []
  "draw a board out of buttons"
  [:div {:class "board"}
   (map board-section-dark (first section-order))
   (map board-section-light (second section-order))])

(defn index [req]
  (layout/common req "TON EIGHTY" (board)))