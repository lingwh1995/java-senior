package org.bluebride.design_pattern._04_action.strategy.basic;

public class RMBPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("人民币支付...");
	}

}
