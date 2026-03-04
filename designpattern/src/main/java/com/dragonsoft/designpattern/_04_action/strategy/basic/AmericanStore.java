package com.dragonsoft.designpattern._04_action.strategy.basic;

public class AmericanStore extends Store {
	
	public AmericanStore() {
		setPayment(new DollarPayment());
		setBargain(new AmericanBargain());
	}
}
