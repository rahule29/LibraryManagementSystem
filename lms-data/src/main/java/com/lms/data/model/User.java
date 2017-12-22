package com.lms.data.model;

public class User {

	private String id;
	private String name;
	private String password;
	private String email;
	private String dob;
	private String mobile;
	private String role;
	private int maxBookCanLend;
	
	public User() {
		super();
	}
	
	public User(String id, String name, String password, String email, String dob, String mobile, String role,
			int maxBookCanLend) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.mobile = mobile;
		this.role = role;
		this.maxBookCanLend = maxBookCanLend;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getMaxBookCanLend() {
		return maxBookCanLend;
	}
	public void setMaxBookCanLend(int maxBookCanLend) {
		this.maxBookCanLend = maxBookCanLend;
	}
}
