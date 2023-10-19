package com.springcore.springbasic.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private List<String> course;

	private Map<String, Integer> courses;

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Person(List<String> course, Map<String, Integer> courses) {
		super();
		this.course = course;
		this.courses = courses;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [course=" + course + ", courses=" + courses + "]";
	}
	

}
