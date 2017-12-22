package com.lms.data.model.dao;

import com.lms.data.model.User;
import com.lms.data.model.database.StaticDataFactory;

public interface UserDAO {
	
	StaticDataFactory dbInstance = StaticDataFactory.getInstance();
	
	void addUsder(User user);
	void removeUser(String userId);
	void updateUser(User user);
	User getUserById(String id);
	User getUserByName(String name);
}
