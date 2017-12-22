package com.lms.data.model.dao;

import com.lms.data.model.User;

public class UserDaoImpl implements UserDAO{

	@Override
	public void addUsder(User user) {
		dbInstance.getUsers().put(user.getId(), user);
	}

	@Override
	public void removeUser(String userId) {
		dbInstance.getUsers().remove(userId);
	}

	@Override
	public void updateUser(User user) {
		dbInstance.getUsers().put(user.getId(), user);
	}

	@Override
	public User getUserById(String id) {
		return dbInstance.getUsers().get(id);
	}

	@Override
	public User getUserByName(String name) {
		for(User user : dbInstance.getUsers().values()){
			if(name.trim().equals(user.getName())){
				return user;
			}
		}
		return null;
	}

}
