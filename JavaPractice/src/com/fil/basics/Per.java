package com.fil.basics;

import java.util.Scanner;

public class Per{
	String first_name;
	String last_name;
	char gender;
	int age;
    float weight;
    
	@Override
	public String toString() {
		return "Person [first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", age=" + age
				+ ", weight=" + weight + "]";
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void Person(String first_name, String last_name, char gender, int age, float weight) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	public Per() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}