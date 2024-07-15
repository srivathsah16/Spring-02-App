package com.ashokit.userapp;

public class UserService {
	private UserDAO userDao;

	public UserService() {
		System.out.println("UserService def-constructor");
	}

	public UserService(UserDAO userDao) {
		System.out.println("UserService param-constructor");
		this.userDao = userDao;
	}

	public void setUserDao(UserDAO userDao) {
		System.out.println("UserService setUserDao method...");
		this.userDao = userDao;
	}

	public void printName(int id) {
		String name = userDao.findName(id);
		System.out.println("Name = " + name);
	}
}
