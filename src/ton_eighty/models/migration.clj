(ns ton-eighty.models.migration
  (:require [clojure.java.jdbc :as sql]))

(defn create-results []
  (sql/with-connection (System/getenv "DATABASE_URL")
    (sql/create-table :results
      [:id :serial "PRIMARY KEY"]
      [:])))

(defn -main []
  (print "Creating database structure...") (flush)

  (println " done"))