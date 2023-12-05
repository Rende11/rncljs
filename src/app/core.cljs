(ns app.core
  (:require
   [shadow.react-native :refer (render-root)]
   ["react-native" :as rn]
   [reagent.core :as r]))


(defn root []
  [:> rn/SafeAreaView
   [:> rn/Text
    "Hello, App!"]])

(defn start
  {:dev/after-load true}
  []
  ;; Note - node name here `rncljs` very inportant and should be equal names in app.json
  (render-root "rncljs" (r/as-element [root])))

(defn init []
  (start))