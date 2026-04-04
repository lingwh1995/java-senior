package org.bluebride.design_pattern._03_structure.decorator.interfac;

public class BlueMountainCoffee implements Coffee {

	@Override
	public void make() {
		System.out.println("制作一杯蓝山咖啡...");
	}

	@Override
	public double cost() {
		return 10.0;
	}

}
