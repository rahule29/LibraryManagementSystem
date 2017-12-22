package com.lms.data.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.lms.data.model.Book;

public class BookDaoImpl implements BookDAO{

	@Override
	public void addBook(Book book) {
		dbInstance.getBooks().put(book.getId(), book);
	}

	@Override
	public void removeBook(Book book) {
		dbInstance.getBooks().remove(book.getId());
	}

	@Override
	public void updateBook(Book book) {
		dbInstance.getBooks().put(book.getId(), book);
	}
	
	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<>(dbInstance.getBooks().values());
	}

	@Override
	public Book getBookById(String id) {
		return dbInstance.getBooks().get(id);
	}

	@Override
	public Book getBookByTitle(String title) {
		for(Book book : dbInstance.getBooks().values()){
			if(title.trim().equals(book.getTitle())){
				return book;
			}
		}
		return null;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		List<Book> books = new ArrayList<>();
		for(Book book : dbInstance.getBooks().values()){
			if(author.trim().equals(book.getAuthor())){
				books.add(book);
			}
		}
		return books;
	}

}
