package com.java.demo;

public class Demo3 {
	
}

class Person{
	String name;
	int age;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ ", aged " +age;
	}
	
}

class Car{
	String model;
	Person driver;
	
	void drive() {
		System.out.println("this + " is being driven by "+ driver, driver.age);
	}
	
	public String toString() {
		return model;
	}
}


Person person1 = new Person();
	person1.name = "Ram";
	

Car car1 = new Car();
	car1.model = "Mercedes";
	car1.driver = person1
	

