package com.dragonsoft.designpattern._04_action.strategy.basic;

public class EnglandBargain implements Bargain{

	@Override
	public void bargain() {
		System.out.println("英格兰人说英格兰语讲价...");
	}

}
