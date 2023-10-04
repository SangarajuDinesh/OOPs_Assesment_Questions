package com.kn.AssesmentQuestions3;

public class User 
{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayInfo()
	{
		System.out.println("Name ="+name);
		System.out.println("Age ="+age);
	}
}
