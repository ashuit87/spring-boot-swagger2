package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiModelProperty;

public class Student {
	@ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="Jacob")
	private String name;
	@ApiModelProperty(notes = "Class of the Student",name="cls",required=true,value="12")
	private String cls;
	@ApiModelProperty(notes = "Country of the Student",name="country",required=true,value="UK")
	private String country;

	
	public Student() {
	}

	public Student(String name, String cls, String country) {
		super();
		this.name = name;
		this.cls = cls;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getCls() {
		return cls;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
	}

}
