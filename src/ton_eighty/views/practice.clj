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

(defn index [req]
  (layout/common req "TON EIGHTY" (one-two-or-three)))