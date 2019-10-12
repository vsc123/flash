package com.example.demo.controller;

public class Student {
	
	public Long id;
	public int age;
	public String name;
	public String Address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Student(Long id, int age, String name, String address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		Address = address;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}