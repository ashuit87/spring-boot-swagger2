package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class Swagger2DemoRestController {

	List<Student> students = new ArrayList<Student>();
	{
		students.add(new Student("Ashu", "8", "India"));
		students.add(new Student("Jacob", "9", "UK"));
		students.add(new Student("July", "10", "USA"));
		students.add(new Student("Jessica", "11", "USA"));
	}

	@ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getStudents")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })

	@RequestMapping(value = "/getStudents")
	public List<Student> getStudents() {
		return students;
	}
}
