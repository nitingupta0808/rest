package com.practice.rest.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.practice.rest.api.IRestController;
import com.practice.rest.model.Student;
import com.practice.service.api.IStudentService;
import com.practice.service.impl.StudentService;


public class RestController implements IRestController {
	
	
	private IStudentService studentService;

	public List<Student> getAll(String name) {
		if(StringUtils.isEmpty(name)){
			return getStudentService().findAll();
		}else{
			return getStudentService().findByName(name);	
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
