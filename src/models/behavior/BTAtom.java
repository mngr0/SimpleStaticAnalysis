package models.behavior;

/**
 * Represents the behavior of an atom (assign, delete, print)
 * @author Abel
 *
 */
public class BTAtom extends BTBase {
	
	int cost;

	public int getCost() {
		return cost;
	}

	/**
	 * The cost of this atom (assign: 0 or 1, delete: -1, print:0)
	 * @param cost
	 */
	public BTAtom(int cost) {
		this.cost = cost;
	}
	
}
