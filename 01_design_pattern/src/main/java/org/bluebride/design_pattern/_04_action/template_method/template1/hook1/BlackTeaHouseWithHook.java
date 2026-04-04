package org.bluebride.design_pattern._04_action.template_method.template1.hook1;

public class BlackTeaHouseWithHook extends TeaHouseTemplate {

	@Override
	public void prepareTealeaf() {
		System.out.println("准备红茶茶叶...");
	}

	@Override
	public boolean hook() {
		return false;
	}
}
