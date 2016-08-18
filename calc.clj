(defn calc [x]
	(def nums (take-nth 2 x))
	(println (+ (int (first nums)) (int (last nums)))))