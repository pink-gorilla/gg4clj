(defproject org.pinkgorilla/gg4clj "0.1.16"
  :description "Wrapper for R's ggplot2 for PinkGorilla Notebook"
  :url "https://github.com/pink-gorilla/gg4clj"
  :license {:name "MIT"}
  ;:deploy-repositories [["releases" :clojars]]
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :username "pinkgorillawb"
                             :sign-releases false}]]
  :dependencies 
  [[org.clojure/clojure "1.10.1"]
   [com.rpl/specter "1.1.3"] ; svg width/height injection
   [org.clojure/data.xml "0.0.8" ] ; make sure old version from tagsoup is not used
   [clj-tagsoup/clj-tagsoup "0.3.0" ; to parse xml from the svg
    :exclusions [org.clojure/clojure ; very, very old clojure version. 
                 org.clojure/core.specs.alpha ; damn old
                 org.clojure/data.xml ; damn old - "0.0.3"
                 ]]
   ])
