package com.lms.data.model;

import java.util.Date;

public class Ledger {
	
	public enum IssuedStatus{
		ISSUED, RETURNED
	}
	
	private String id;
	private Date lendedOn;
	private String lendedFor;
	private String lendedBook;
	private int quantity;
	private IssuedStatus status;
	private Date notificationOn;
	private Date returnedOn;
	
	public Ledger() {
		super();
	}
	
	public Ledger(String id, Date lendedOn, String lendedFor, String lendedBook, int quantity, IssuedStatus status, Date notificationOn,
			Date returnedOn) {
		super();
		this.id = id;
		this.lendedOn = lendedOn;
		this.lendedFor = lendedFor;
		this.lendedBook = lendedBook;
		this.quantity = quantity;
		this.status = status;
		this.notificationOn = notificationOn;
		this.returnedOn = returnedOn;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getLendedOn() {
		return lendedOn;
	}
	public void setLendedOn(Date lendedOn) {
		this.lendedOn = lendedOn;
	}
	public String getLendedFor() {
		return lendedFor;
	}
	public String getLendedBook() {
		return lendedBook;
	}
	public void setLendedBook(String lendedBook) {
		this.lendedBook = lendedBook;
	}
	public void setLendedFor(String lendedFor) {
		this.lendedFor = lendedFor;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public IssuedStatus getStatus() {
		return status;
	}
	public void setStatus(IssuedStatus status) {
		this.status = status;
	}
	public Date getNotificationOn() {
		return notificationOn;
	}
	public void setNotificationOn(Date notificationOn) {
		this.notificationOn = notificationOn;
	}
	public Date getReturnedOn() {
		return returnedOn;
	}
	public void setReturnedOn(Date returnedOn) {
		this.returnedOn = returnedOn;
	}
}
