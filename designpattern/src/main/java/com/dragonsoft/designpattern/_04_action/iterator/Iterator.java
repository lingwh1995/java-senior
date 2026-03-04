package com.dragonsoft.designpattern._04_action.iterator;

public interface Iterator {
	
	boolean hasNext();
	String next();
	void remove();
}
