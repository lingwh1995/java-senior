package com.dragonsoft.designpattern._02_create.factory.abstractfactory;

public class NikeTrousers implements ITrousers{

	@Override
	public void produce() {
		System.out.println("Nike Trousers produce ok...");
	}

}
