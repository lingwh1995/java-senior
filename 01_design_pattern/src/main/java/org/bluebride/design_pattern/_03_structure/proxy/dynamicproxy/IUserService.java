package org.bluebride.design_pattern._03_structure.proxy.dynamicproxy;

public interface IUserService {
	
	void deleteById(String id);
	User getById(String id);
	void showUsers();
}
