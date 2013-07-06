;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.


(use 'clojure.repl)

(require '[hiccup.core :as h])

(h/html [:h1 "Hello World"])

(require '[hiccup.page :as h5])

(defn index []
  (h5/html5
   [:head
    [:title "Hello World"]]
   [:body
    [:div {:id "content"} "Hello World"]]))

(index)

(require '[ton-eighty.views.layout :as l])

(require '[ton-eighty.views.home :as home])
(require '[ton-eighty.views.game :as game])
(require '[ton-eighty.views.practice :as practice])
(require '[ton-eighty.controllers.home :as home-controller])

(game/game-form)

(practice/one-two-or-three)