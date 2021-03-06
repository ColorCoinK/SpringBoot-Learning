package com.example.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -1L;

	private String userName;
	private Integer age;

	public User() {
		super();
	}

	public User(String userName, Integer age) {
		super();
		this.userName = userName;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
