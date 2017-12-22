package com.lms.data.model.dao;

import java.util.List;

import com.lms.data.model.Book;
import com.lms.data.model.database.StaticDataFactory;

public interface BookDAO {

	StaticDataFactory dbInstance = StaticDataFactory.getInstance();
	
	void addBook(Book book);
	void removeBook(Book book);
	void updateBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(String id);
	Book getBookByTitle(String title);
	List<Book> getBookByAuthor(String author);
}
