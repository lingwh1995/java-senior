package com.dragonsoft.designpattern._03_structure.composite.transparent.abs1;

public class Department extends OrganizationComponment {
	
	public Department(String organizationName) {
		this.organizationName = organizationName;
	}
	
	@Override
	public void show() {
		System.out.println("-系名称:"+organizationName);
	}

}
