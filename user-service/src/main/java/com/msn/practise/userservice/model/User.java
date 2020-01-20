package com.msn.practise.userservice.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/

//@ApiModel(description = "All details about the user")
public class User {
	
	public User(int id, String name, int age, String department, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.setDob(dob);
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", dob=" + dob
				+ "]";
	}

	@NotNull
	private int id;
	
	@Size(min = 3, max = 20)
	//@ApiModelProperty(notes = "User name should be between 3 to 20 chararacters")
	private String name;
	
	private int age;
	
	@Size(max = 15, message = "Size of the department should be less than 15")
	//@ApiModelProperty(notes = "Department name should be less than 15 charachers")
	private String department;
	
	@Past
	//@ApiModelProperty(notes = "Birthdate should be in the past")
	private Date dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
