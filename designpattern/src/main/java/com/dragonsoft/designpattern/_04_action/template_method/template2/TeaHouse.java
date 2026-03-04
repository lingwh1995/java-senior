package com.dragonsoft.designpattern._04_action.template_method.template2;

public interface TeaHouse {
	
	void prepareWater();
	void prepareCup();
	void prepareTealeaf();
	//钩子方法
	void addSuger();
	void addWater();
}
