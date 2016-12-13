package com.practice.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;

import com.practice.rest.api.IRestController;
import com.practice.rest.model.Student;
import com.practice.service.api.IStudentService;
import com.practice.service.impl.StudentService;


@Path("/student")
public class RestController {
	
	
	private IStudentService studentService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAll() {
		if(StringUtils.isEmpty("")){
			return getStudentService().findAll();
		}else{
			return new ArrayList<>();
			//return getStudentService().findByName(name);	
		}
	
	}

	public Student findByRollNumber(int rollNumber) {
		return getStudentService().findById(rollNumber);
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub

	}

	public void deleteByRollNumber(int rollNumber) {
		// TODO Auto-generated method stub

	}

	public Student addOrUpdateStudent(int rollNumber, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public IStudentService getStudentService() {
		if(studentService == null){
			studentService = new StudentService();
		}
		return studentService;
	}

	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

}
