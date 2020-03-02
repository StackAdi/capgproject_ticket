package com.capgemini.movie.model;

import java.io.Serializable;

public class User implements Serializable {

	int userId;
	String password;

	/*
	 * public User(int i, String string) { // TODO Auto-generated constructor stub
	 * userId = i; password = string; }
	 */
	public User(int i, String string) {
		// TODO Auto-generated constructor stub
		this.userId = i;
		this.password = string;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
