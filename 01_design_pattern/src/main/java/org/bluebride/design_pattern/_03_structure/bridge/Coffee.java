package org.bluebride.design_pattern._03_structure.bridge;

public abstract class Coffee {
	
	protected ICoffeeAdditive coffeeAdditive;

	public void setCoffeeAdditive(ICoffeeAdditive coffeeAdditive) {
		this.coffeeAdditive = coffeeAdditive;
	}

	public void orderCoffee() {
		coffeeAdditive.addCoffeeAdditive();
	}
	
}
