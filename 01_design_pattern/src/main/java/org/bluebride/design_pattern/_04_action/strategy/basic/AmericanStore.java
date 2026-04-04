package org.bluebride.design_pattern._04_action.strategy.basic;

public class AmericanStore extends Store {
	
	public AmericanStore() {
		setPayment(new DollarPayment());
		setBargain(new AmericanBargain());
	}
}
