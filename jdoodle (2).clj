(ns clojure.examples.hello
(:gen-class))

(defn ClojurePractice []
    
    ;; delcaration of three data types
    
    (def x 999)
    (def y 999.9)
    (def string "Hi!!!!")
    
    
    ;;printing of three seperate data types

    (println x)
    (println y)
    (println string))

    ;;while loop
    
    (def a (atom 0))
    
    (while (< @a 6)
     (do
        (println @a)
        (swap! a inc)))
    
    
    ;;doseq statement
    
    (doseq [n [0 1 2 3]]
    (println n))

    
    ;;Dotimes statement
    
    (dotimes [n 5]
    (println n))

    ;;loop statement
   
    (loop [a 12]
         (when(> a 1)
          (println a)
          (recur (- a 3))))
      
    
    ;;string concatenation
    
    (def sentence (str "These parentheses" " are taking me over :("))
    
    (println sentence)
    
    ;;multiparameter function
    
    (defn sum[a b]
        (+ a b))
    
    ;;printing of function result
    
    (def answer (sum 99 99))
    (println answer)



(ClojurePractice)