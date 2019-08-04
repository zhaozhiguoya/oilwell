package com.crx.service;

import com.crx.pojo.User;

public interface userService {

	
	void insert(User user);
	void delete(int id);
	void update(User user);
	User findById(int id);
	User findByName(String name);
}
