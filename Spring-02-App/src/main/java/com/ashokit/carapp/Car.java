package com.ashokit.carapp;

public class Car {
	private IEngine engine;

	public Car() {
		System.out.println("Car :: def-constructor");
	}

	public Car(IEngine engine) {
		System.out.println("Car :: param-constructor");
		this.engine = engine;
	}

	public void setEngine(IEngine engine) {
		System.out.println("Car :: setEngine method");
		System.out.println(engine);
		this.engine = engine;
	}

	public void drive() {
		int value = engine.start();
		if (value > 0) {
			System.out.println("Journey started...");
		} else {
			System.out.println("Problem in engine...");
		}
	}
}
