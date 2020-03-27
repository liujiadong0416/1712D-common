package com.liujiadong.movie.utils;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private String about;
	private String date;
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", date=" + date + "]";
	}
	public Person(String name, int age, String about, String date) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.date = date;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
