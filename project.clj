(defproject cname30x "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://cname30x.herokuapp.com"
  :license {:name "FIXME: choose"
            :url "http://example.com/FIXME"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [ring/ring-devel "1.2.2"]
                 [ring-basic-authentication "1.0.5"]
                 [environ "0.5.0"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]
            ; [lein-ring "0.8.12"]
            ]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "cname30x-standalone.jar"
  :profiles {:production {:env {:production true}}}
  :main cname30x.web
  ; :ring {:handler cname30x.web/wrap-app}
  )
