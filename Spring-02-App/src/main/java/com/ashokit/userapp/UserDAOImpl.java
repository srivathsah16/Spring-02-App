package com.ashokit.userapp;

public class UserDAOImpl implements UserDAO {
	public UserDAOImpl() {
		System.out.println("UserDAOImpl Constructor...");
	}
	@Override
	public String findName(int id) {
		//some db logic
		return "testName";
	}

}
