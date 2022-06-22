package com.cg.userservice.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Integer userId;
	private String name;
	private Long phno;

	List<Contact> contacts = new ArrayList<>();

	public User() {

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public User(Integer userId, String name, Long phno, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phno = phno;
		this.contacts = contacts;
	}

	public User(Integer userId, String name, Long phno) {
		super();
		this.userId = userId;
		this.name = name;
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
