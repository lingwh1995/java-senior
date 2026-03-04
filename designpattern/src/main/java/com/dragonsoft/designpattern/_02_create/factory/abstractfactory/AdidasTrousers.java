package com.dragonsoft.designpattern._02_create.factory.abstractfactory;

public class AdidasTrousers implements ITrousers {

	@Override
	public void produce() {
		System.out.println("Adidas Trousers produce ok...");
	}

}
