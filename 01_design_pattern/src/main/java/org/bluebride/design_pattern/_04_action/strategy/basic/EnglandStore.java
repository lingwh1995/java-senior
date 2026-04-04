package org.bluebride.design_pattern._04_action.strategy.basic;

public class EnglandStore extends Store {
	
	public EnglandStore() {
		setPayment(new PoundPayment());
		setBargain(new EnglandBargain());
	}
}
