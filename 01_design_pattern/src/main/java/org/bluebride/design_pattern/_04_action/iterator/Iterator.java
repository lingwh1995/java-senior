package org.bluebride.design_pattern._04_action.iterator;

public interface Iterator {
	
	boolean hasNext();
	String next();
	void remove();
}
