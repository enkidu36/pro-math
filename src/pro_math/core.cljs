(ns pro-math.core
  (:require
    [goog.dom :as gdom]
    [reagent.core :as r]))

(defn main []
  [:div "Hello world"])

(defn ^{:after-load true, :dev/after-load true}
  mount []
  (reagent.dom/render [main] (gdom/getElement "app")))

(defn ^:export init []
  (mount))
