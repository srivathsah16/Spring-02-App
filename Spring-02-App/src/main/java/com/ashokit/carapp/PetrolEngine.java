package com.ashokit.carapp;

public class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("PetrolEngine :: def-constructor");
	}

	@Override
	public int start() {
		System.out.println("Car starting with Petrol Engine");
		return 1;
	}

}
