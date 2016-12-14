package com.practice.rest.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;

import com.practice.rest.api.IRestController;
import com.practice.rest.model.Student;
import com.practice.service.api.IStudentService;
import com.practice.service.impl.StudentService;


@Path("/student")
public class RestController implements IRestController {
	
	
	private IStudentService studentService;
	
	@GET
	@Path("/test")
	public String test() {
		return "Hello World";
	}	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAll(@QueryParam("name")String name) {
		if(StringUtils.isEmpty(name)){
			return getStudentService().findAll();
		}else{
			return getStudentService().findByName(name);	
		}
	
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{rollNumber}")
	public Student findByRollNumber(@PathParam("rollNumber")int rollNumber) {
		return getStudentService().findById(rollNumber);
	}

	@POST
	public void deleteByName(@QueryParam("name")String name) {
		// TODO Auto-generated method stub
	}

	@DELETE
	@Path("/{rollNumber}")
	public void deleteByRollNumber(@PathParam("rollNumber")int rollNumber) {
		// TODO Auto-generated method stub

	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{rollNumber}")
	public Student addOrUpdateStudent(@PathParam("rollNumber")int rollNumber, Student student) {
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
