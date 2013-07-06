(ns ton-eighty.views.home
  (:use
        [hiccup.core :only (h)]
        [hiccup.form :only (form-to label text-field select-options)]
        [clojure.string :only (lower-case)])
  (:require [ton-eighty.views.layout :as layout]))

(defn index [req]
  (layout/common req "TON EIGHTY" [:div {:class "header"} "Ton Eighty"]))

