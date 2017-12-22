package com.lms.data.model;

import java.util.Date;

public class Book {

	private String id;
	private String title;
	private String author;
	private Date publishedOn;
	private Date addedOn;
	private Date lastModifiedOn;
	private int noOfCopiesInLibrary;
	
	public Book() {
		super();
	}
	
	public Book(String id, String title, String author, Date publishedOn, Date addedOn, Date lastModifiedOn,
			int noOfCopiesInLibrary) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishedOn = publishedOn;
		this.addedOn = addedOn;
		this.lastModifiedOn = lastModifiedOn;
		this.noOfCopiesInLibrary = noOfCopiesInLibrary;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(Date publishedOn) {
		this.publishedOn = publishedOn;
	}
	public Date getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}
	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
	public int getNoOfCopiesInLibrary() {
		return noOfCopiesInLibrary;
	}
	public void setNoOfCopiesInLibrary(int noOfCopiesInLibrary) {
		this.noOfCopiesInLibrary = noOfCopiesInLibrary;
	}
}
