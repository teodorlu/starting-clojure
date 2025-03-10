;; # Towards interactive programming: _one expression_
{:nextjournal.clerk/visibility {:code :hide}}
(ns towards-interactive-programming.one-expression
  (:require
   [clojure.set :as set]
   [clojure.walk :refer [postwalk]]
   [nextjournal.clerk :as clerk]))

;; Getting feedback from evaluating a single expression is a great way to get
;; feedback in Clojure. When learning the language, evaluate expressions to
;; learn what happens.

(clerk/example
  (map even? (range 10))
  (map (juxt identity even?) (range 10))
  (set/union #{1 2 3 4 5} #{1 3 5 7 9})
  (set/intersection #{1 2 3 4 5} #{1 3 5 7 9})
  (set/difference #{1 2 3 4 5} #{1 3 5 7 9})

  )

;; But ... what about when you write a function?

;; But ... when you write a function, you can no longer evalulate in-line, right?

(let [!effects (atom [])
      e (partial swap! !effects conj)]
  (let [lazy (map (fn [i]
                      (e i)
                      {:i i})
                    (range 10))
        postwalked (postwalk identity lazy)]
    [@!effects postwalked]))

(+ 50000 (rand-int 10000))
