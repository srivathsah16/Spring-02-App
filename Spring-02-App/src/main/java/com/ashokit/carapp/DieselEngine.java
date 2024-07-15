package com.ashokit.carapp;

public class DieselEngine implements IEngine {
	public DieselEngine() {
		System.out.println("DieselEngine :: def-constructor");
	}

	@Override
	public int start() {
		System.out.println("Car starting with Diesel Engine");
		return 1;
	}

}
