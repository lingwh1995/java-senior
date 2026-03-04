package com.dragonsoft.designpattern._04_action.memento.memento1;

/**
 * 备忘录角色
 * @author lingwh
 *
 */
public class Memento {
	
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}
