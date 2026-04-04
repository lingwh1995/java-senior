package org.bluebride.design_pattern._03_structure.bridge;

public class Sugar implements ICoffeeAdditive {

	@Override
	public void addCoffeeAdditive() {
		System.out.println("给咖啡加糖...");
	}

}
