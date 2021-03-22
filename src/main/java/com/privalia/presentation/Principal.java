package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");

		System.out.println(helloWorld.getHello());
		System.out.println(helloWorld.hashCode());
		System.out.println(helloWorld2.hashCode());

		if (helloWorld == helloWorld2) {
			System.out.println("Las dos variables apuntan al mismo objeto");
		}

		HelloWorld helloWorldConst = (HelloWorld) context
				.getBean("helloWorldConst");
		System.out.println(helloWorldConst.getHello());
		System.out.println(helloWorldConst.hashCode());

		context.close();
	}

}
