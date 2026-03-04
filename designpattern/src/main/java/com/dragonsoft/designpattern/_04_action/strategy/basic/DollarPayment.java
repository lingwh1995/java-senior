package com.dragonsoft.designpattern._04_action.strategy.basic;

public class DollarPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("美元支付...");
	}

}
