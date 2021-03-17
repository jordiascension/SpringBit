package com.privalia.ejercicio1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		Student student = (Student) context.getBean("student");

		System.out.println(student.getIdStudent());
		System.out.println(student.getName());
		System.out.println(student.getSurname());
		System.out.println(student.getAge());
		System.out.println(student.getDateOfBirth());

		context.close();
	}

}
