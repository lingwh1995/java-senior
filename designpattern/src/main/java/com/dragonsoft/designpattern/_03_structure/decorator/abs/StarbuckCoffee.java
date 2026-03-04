package com.dragonsoft.designpattern._03_structure.decorator.abs;

public class StarbuckCoffee extends Coffee{
	
	public StarbuckCoffee() {
		description = "Starbuck Coffee...";
	}

	@Override
	public double cost() {
		return 20.0;
	}

}
