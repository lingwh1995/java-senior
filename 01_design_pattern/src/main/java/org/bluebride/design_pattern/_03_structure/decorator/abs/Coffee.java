package org.bluebride.design_pattern._03_structure.decorator.abs;

public abstract class Coffee {
	
	protected String description = "Unknown Coffee";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
