(ns bitsets
  ;; the bitsets we're working with, java 8. check out these docs:
  ;; https://docs.oracle.com/javase/8/docs/api/java/util/BitSet.html
  (import [java.util BitSet]))

(def our-first-bitset!
  "adorable"
  (new BitSet))

(defn set!
  [^BitSet bs ^Integer n]
  (.set bs n))

(defn functional-set!
  [^BitSet bs ^Integer n]
  (.set bs n)
  bs)
