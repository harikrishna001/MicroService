package com.sathya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Browser {
	
	@Id
	private Integer id;
	
	private String name;
	
	private double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Browser [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
