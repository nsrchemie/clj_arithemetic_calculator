(defn calc [x]
	(def nums (take-nth 2 x))
	(def num1 (Character/digit (first nums) 10))
	(def num2 (Character/digit (last nums) 10))
	(def ops {"+" +})
	(def oper (str (get x 1)))
	(pr-str ((ops oper) num1 num2)))