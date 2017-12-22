package com.lms.handler;

import javax.servlet.http.HttpServletRequest;

import com.lms.data.model.User;
import com.lms.data.model.dao.UserDAO;
import com.lms.data.model.dao.UserDaoImpl;

public class UserHandler {
	UserDAO dao =  new UserDaoImpl();
	
	public User addUser(HttpServletRequest request){
		// Collect all the information of User 
		User user = new User(); // Set all the information from request
		dao.addUsder(user);
		return user;
	}
	
	public void removeUser(HttpServletRequest request){
		// Collect all the information of User 
		dao.removeUser("USER_ID"); // PASS USER ID TAKING FROM UI
	}
	
	
}
