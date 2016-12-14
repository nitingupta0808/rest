package com.practice.rest.api;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.practice.rest.model.Student;

public interface IRestController {

	public List<Student> getAll(@QueryParam("name") String name);
	
	public Student findByRollNumber(@PathParam("rollNumber") int rollNumber);
	
	public void deleteByName(String name);
	
	public void deleteByRollNumber(@PathParam("rollNumber") int rollNumber);
	
	public Student addOrUpdateStudent(@PathParam("rollNumber") int rollNumber, Student student);
	
}
