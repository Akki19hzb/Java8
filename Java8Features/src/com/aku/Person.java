package com.aku;

public class Person {
	String firstname, lastname,gender;
	int age;
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {

	}

	
	public Person(String firstname, String lastname, int age,String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname +", age=" + age+ ", gender=" + gender  
				+ "]";
	}


}
