package com.dragonsoft.designpattern._04_action.strategy.basic;

public class ChineseStore extends Store {

	public ChineseStore() {
		setPayment(new RMBPayment());
		setBargain(new ChineseBargain());
	}

}
