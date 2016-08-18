(defn calc [x]
	(def nums (take-nth 2 x))
	(def corrected (for [x nums] (Character/digit x 10)))
	(def ops {"+" + "-" - "/" / "*" *})
	(def oper (str (get x 1)))
	(defn combine [vals] (reduce (ops oper) vals))
	(pr-str (combine corrected)))