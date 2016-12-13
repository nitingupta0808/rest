package com.practice.rest.api;

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

import com.practice.rest.model.Student;

@Path("/student")
public interface IRestController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAll(@QueryParam("name") String name);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{rollNumber}")
	public Student findByRollNumber(@PathParam("rollNumber") int rollNumber);
	
	@POST
	public void deleteByName(@QueryParam("name") String name);
	
	@DELETE
	@Path("/{rollNumber}")
	public void deleteByRollNumber(@PathParam("rollNumber") int rollNumber);
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{rollNumber}")
	public Student addOrUpdateStudent(@PathParam("rollNumber") int rollNumber, Student student);
	
}
