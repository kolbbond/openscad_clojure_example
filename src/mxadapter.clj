(ns mxadapter
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

(def primitives
  (union
         (cube 10 100 100)
               (sphere 10)
              (cylinder 10 150) 
               ))

(spit "models/mxadapter.scad"
      (write-scad primitives))
