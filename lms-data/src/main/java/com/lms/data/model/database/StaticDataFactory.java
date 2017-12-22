package com.lms.data.model.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.lms.data.model.Book;
import com.lms.data.model.Ledger;
import com.lms.data.model.Ledger.IssuedStatus;
import com.lms.data.model.User;

public class StaticDataFactory {

	private static Map<String, Book> books = new HashMap<>();
	private static Map<String, User> users = new HashMap<>();
	private static Map<String, Ledger> ledgers = new HashMap<>();
	
	private static StaticDataFactory instance = new StaticDataFactory();
	
	private StaticDataFactory(){
		//SingleTon Class
	}

	public static StaticDataFactory getInstance() {
		if(instance == null){
			instance = new StaticDataFactory();
			
			Book book1 = new Book("B-1", "Book1", "Rahul", new Date(), new Date(), new Date(), 4);
			Book book2 = new Book("B-2", "Book2", "Pavan", new Date(), new Date(), new Date(), 10);
			Book book3 = new Book("B-3", "Book3", "Suresh", new Date(), new Date(), new Date(), 4);
			Book book4 = new Book("B-4", "Book4", "Amrut", new Date(), new Date(), new Date(), 8);
			books.put("B-1", book1);
			books.put("B-2", book2);
			books.put("B-3", book3);
			books.put("B-4", book4);
			
			User user1 = new User("U-1", "Supritha", "supi", "supri@supri.com", "01/01/1992", "984501234", "ROLE-EMP", 5);
			User user2 = new User("U-2", "bhoomika", "bhoomi", "bhoomi@bhoomi.com", "01/01/1992", "984501234", "ROLE-EMP", 5);
			User user3 = new User("U-3", "Rahul", "rahul", "rahul@rahul.com", "01/01/1986", "984501234", "ROLE-ADMIN", -1);
			User user4 = new User("U-4", "Amrut", "am", "am@am.com", "01/01/1992", "984501234", "ROLE-SERVICE-DESK", 8);
			users.put("U-1", user1);
			users.put("U-2", user2);
			users.put("U-3", user3);
			users.put("U-4", user4);
			
			Ledger ledger1 = new Ledger("L-1", new Date(), "U-1", "B-2", 2, IssuedStatus.ISSUED, new Date(), null);
			ledgers.put("L-1", ledger1);
			
		}
		return instance;
	}

	public Map<String, Book> getBooks() {
		return books;
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public Map<String, Ledger> getLedgers() {
		return ledgers;
	}
	

}
