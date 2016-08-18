(defn calc [x]
	(def nums (take-nth 2 x))
	(println (first nums), (last nums))