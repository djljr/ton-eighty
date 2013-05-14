(ns ton-eighty.views.layout
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn navbar []
  (html5
   [:div {:class "navbar-wrapper"}
    [:div {:class "container"}
     [:div {:class "navbar navbar-inverse"}
      [:div {:class "navbar-inner"}
       [:button {:type "button" :class "btn btn-navbar" :data-toggle "collapse" :data-target ".nav-collapse"}
        [:span {:class "icon-bar"}]
        [:span {:class "icon-bar"}]
        [:span {:class "icon-bar"}]]
       [:a {:class "brand" :href "#"} "Ton Eighty"]
       [:div {:class "nav-collapse collapse"}
        [:ul {:class "nav"}
         [:li {:class "active"} [:a {:href "#"} "Home"]]
         [:li [:a {:href "#"} "About"]]
         [:li [:a {:href "#"} "Contact"]]]]]]]]))

(defn common [title & body]
  (html5
   [:head
    [:meta {:charset "utf8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
    [:title title]
    (include-css "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.no-icons.min.css")
    (include-css "/stylesheets/base.css")
    (include-css "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-responsive.min.css")]
   [:body
    (navbar)
    [:div {:id "content" class "container"} body]
    (include-js "//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js")
    (include-js "//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/js/bootstrap.min.js")]))

(defn four-oh-four []
  (common "Page Not Found"
          [:div {:id "four-oh-four"}
           "The page you requested could not be found"]))