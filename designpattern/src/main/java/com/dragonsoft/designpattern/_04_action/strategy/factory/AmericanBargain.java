package com.dragonsoft.designpattern._04_action.strategy.factory;

public class AmericanBargain implements Bargain{

	@Override
	public void bargain() {
		System.out.println("美国人说英语讲价...");
	}

}
