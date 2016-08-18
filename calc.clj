(defn calc [x]
	(def nums (take-nth 2 x))
	(def num1 (Character/digit (first nums) 10))
	(def num2 (last nums))
	(println num1, (type num1), (type num2)))