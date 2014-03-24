package com.gandhi.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		HelloWorld helloWorld = (HelloWorld) appContext.getBean("helloBean");
		helloWorld.print();

	}
}
