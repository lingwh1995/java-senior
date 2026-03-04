package com.dragonsoft.designpattern._04_action.strategy.basic;

public class PoundPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("英镑支付...");
	}

}
