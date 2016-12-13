package com.practice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.rest.model.Student;
import com.practice.service.api.IStudentService;

public class StudentService implements IStudentService {

	private static List<Student> students;

	static {
		students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setAge(10);
		s1.setGrade("A");
		s1.setName("Rahul");
		s1.setRollNumber(1);
		students.add(s1);

		Student s2 = new Student();
		s2.setAge(12);
		s2.setGrade("B");
		s2.setName("Prem");
		s2.setRollNumber(2);
		students.add(s2);

		Student s3 = new Student();
		s3.setAge(10);
		s3.setGrade("A");
		s3.setName("Vivek");
		s3.setRollNumber(3);
		students.add(s3);
	}

	public List<Student> findAll() {
		return students;
	}

	public Student findById(int rollNo) {
		return students.stream().// convert list to stream
				filter((student) -> student.getRollNumber() == rollNo).findAny().get();
	}

	public List<Student> findByName(String name) {
		return students.stream() // convert list to stream
				.filter(student -> name.equals(student.getName())).collect(Collectors.toList());
	}

	public void deleteById(int rollNo) {
		// TODO Auto-generated method stub

	}

	public int deleteByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Student addOrUpdate(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
