package com.dragonsoft.designpattern._04_action.strategy.factory;

public class RMBPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("人民币支付...");
	}

}
