package com.gandhi.helloworld;

public class HelloWorld {

	private String name;

	public HelloWorld(String name) {
		this.name = name;
	}

	public HelloWorld() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Hello " + name);
	}

}
