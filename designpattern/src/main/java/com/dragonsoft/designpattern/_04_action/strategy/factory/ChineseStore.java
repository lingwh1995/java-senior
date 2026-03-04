package com.dragonsoft.designpattern._04_action.strategy.factory;

public class ChineseStore extends Store {

	public ChineseStore() {
		setPayment(new RMBPayment());
		setBargain(new ChineseBargain());
	}

}
