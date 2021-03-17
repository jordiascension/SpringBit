package com.privalia.ejercicio2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		annotationContext.scan("com.privalia.ejercicio2");
		annotationContext.refresh();

		Student student = (Student) annotationContext.getBean("student");

		System.out.println(student.getIdStudent());
		System.out.println(student.getName());
		System.out.println(student.getSurname());
		System.out.println(student.getAge());
		System.out.println(student.getDateOfBirth());

		annotationContext.close();
	}

}
