package com.hamp.javaee.service;

import java.util.Optional;

import com.hamp.javaee.model.Student;

public class StudentService {

	public Optional<Student> getStudent(int id) {
		switch (id) {
		case 1:
			return Optional.of(new Student(1, "Henry", "Mendoza Puerta"));
		case 2:
			return Optional.of(new Student(2, "Alexandra", "Melendez Leon"));
		case 3:
			return Optional.of(new Student(3, "Max", "Sanchez Rodriguez"));
		default:
			return Optional.empty();
		}
	}

}
