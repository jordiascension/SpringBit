package com.privalia.ejercicio2;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student")
public class Student {

	@Autowired
	@Value("1")
	private Integer idStudent;

	@Autowired
	@Value("Pepe")
	private String name;

	@Autowired
	@Value("Biel")
	private String surname;

	@Autowired
	@Value("24")
	private Integer age;

	@Autowired
	@Value("#{T(java.time.LocalDate).parse('2018-06-20')}")
	private LocalDate dateOfBirth;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {

	}

}
