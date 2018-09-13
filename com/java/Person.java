package com.java;

public class Person {
	
	public String firstName;
	public String lastName;
	public char gender;
	public int age;
	public float weight;
	public static double phoneNumber;
	
	
	//get-set
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	
	/*//constructor
	Person(String firstName, String lastName, char gender, int age, float weight, double phoneNumber){
		System.out.println("Person Details by parameterized Constructor:");
		this.firstName= firstName;
		
	}*/
	
	
	//method
	
	public void displayDetails(){
	System.out.println("Phone Numer:"+ phoneNumber);	
	}


public static void main(String[] args) {
		
		//object of class person
		Person person1 = new Person();
		
		person1.setFirstName("Divaya");
		person1.setLastName("Bharti");
		person1.setGender('F');
		person1.setAge(20);
		person1.setWeight(85.55f);
		
		System.out.println("Person Details:");
		
		System.out.println("First Name:"+ person1.firstName);
		System.out.println("Last Name" + person1.lastName);
		System.out.println("Gender:"+ person1.gender);
		System.out.println("Age:"+ person1.age);
		System.out.println("Weight:"+ person1.weight);
		System.out.println("Phone Number:" + phoneNumber);
		
		

	}
	
}
