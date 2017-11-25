(ns recipes.declarative-mutation-refresh-server
  (:require
    [fulcro.server :refer [defmutation]]
    [fulcro.util :as util]))

(defmutation cards.declarative-mutation-refresh/ping-right [params]
  (action [env]
    (Thread/sleep 500)
    {:db/id 1 :right/value (util/unique-key)}) )
