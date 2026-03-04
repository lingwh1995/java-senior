package com.dragonsoft.designpattern._02_create.factory.genericfactory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		if (pizzaType.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (pizzaType.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (pizzaType.equals("clam")) {
			pizza = new ClamPizza();
		} 
		return pizza;
	}
}
