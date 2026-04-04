package org.bluebride.design_pattern._03_structure.proxy.staticproxy;

public interface IUserService {
	
	void deleteById(String id);
	User getById(String id);
	void showUsers();
}
