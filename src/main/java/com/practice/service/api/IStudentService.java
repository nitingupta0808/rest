package com.practice.service.api;

import java.util.List;
import com.practice.rest.model.Student;

public interface IStudentService {
	
public List<Student> findAll();

public Student findById(int rollNo);

public List<Student> findByName(String name);

public void deleteById(int rollNo);

public int deleteByName(String name);

public Student addOrUpdate(Student student);

}
