(defn calc [x]
	(def nums (take-nth 2 x))
	(def ops {"+" +})
	(def oper (str (get x 1)))
	(pr-str ((ops oper) (Character/digit (first nums) 10)
	 (Character/digit (last nums) 10))))
