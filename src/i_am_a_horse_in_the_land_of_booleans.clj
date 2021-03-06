(ns i-am-a-horse-in-the-land-of-booleans
    (:refer-clojure :exclude [boolean]))

(defn boolean [x]
    (not (or (= x nil) (= x false))))

(defn abs [x]
    (if (< x 0)
        (* x -1)
        x))

(defn divides? [divisor n]
    (== 0 (mod n divisor)))

(defn fizzbuzz [n]
    (cond
        (divides? 15 n) "gotcha!"
        (divides? 5 n)  "buzz"
        (divides? 3 n)  "fizz"
        :else           ""))

(defn teen? [age]
    (and (<= age 19) (>= age 13)))

(defn not-teen? [age]
    (not (teen? age)))

(defn generic-doublificate [x]
    (cond
        (number? x)                 (* x 2)
        (empty? x)                  nil
        (or (list? x) (vector? x))  (* (count x) 2)
        :else                       true))

(defn leap-year? [year]
    (cond
        (not (divides? 4 year))     false
        (not (divides? 100 year))   true
        (not (divides? 400 year))   false
        :else                       true))

; '_______'
