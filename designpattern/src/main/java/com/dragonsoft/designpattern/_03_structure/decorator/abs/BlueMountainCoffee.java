package com.dragonsoft.designpattern._03_structure.decorator.abs;

public class BlueMountainCoffee extends Coffee {
	
	public BlueMountainCoffee() {
		description = "Blue Mountain Coffee...";
	}

	@Override
	public double cost() {
		return 10.0;
	}

}
