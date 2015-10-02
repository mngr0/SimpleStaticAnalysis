package models.behavior;

import java.util.List;

public class BTBlock extends BTBase {

	int maximum;	
	int total;
	List<Integer> printedValues;
	
	/**
	 * @param maximum
	 * @param total
	 * @param printedValues
	 */
	public BTBlock(int maximum, int total, List<Integer> printedValues) {
		this.maximum = maximum;
		this.total = total;
		this.printedValues = printedValues;
	}

	@Override
	public String toString() {
		
		return String.format("[max: %d, total: %d, prints:%s]", maximum, total, printedValues);
	}
}
