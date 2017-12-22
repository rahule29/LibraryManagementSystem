package com.lms.handler;

import javax.servlet.http.HttpServletRequest;

import com.lms.data.model.Book;
import com.lms.data.model.dao.BookDAO;
import com.lms.data.model.dao.BookDaoImpl;

public class BookHandler {
	BookDAO dao =  new BookDaoImpl();
	
	public Book addUser(HttpServletRequest request){
		// Collect all the information of User 
		Book book = new Book(); // Set all the information from request
		dao.addBook(book);
		return book;
	}
	
	public void removeUser(HttpServletRequest request){
		// Collect all the information of User 
		Book book = new Book();
		dao.removeBook(book); // PASS USER ID TAKING FROM UI
	}
	
	
}
