;;;; This file is part of gg4clj. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gg4clj is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(defproject pinkgorilla.ui.gg4clj "0.1.10"
  :description "A simple wrapper for R's ggplot2 in Clojure and Gorilla REPL."
  :url "https://github.com/pinkgorillawb/gg4clj"
  :license {:name "MIT"}
  
  ;:deploy-repositories [["releases" :clojars]]
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :username "pinkgorillawb"
                             :sign-releases false}]]
  
  :dependencies 
  [;[org.clojure/clojure "1.10.0"]
   [org.clojure/clojure "1.9.0-alpha14"] ; downgrade to pinggorilla version
   ;[org.clojars.deas/gorilla-renderable "2.1.0"] ;PinkGorilla Renderable
   [pinkgorilla.ui.gorilla-renderable "1.0.1"] ;PinkGorilla Renderable

   ]
  :plugins [
      ; [org.clojars.benfb/lein-gorilla "0.6.0"]
      ;[lein-gorilla "0.3.4"]
            ])
