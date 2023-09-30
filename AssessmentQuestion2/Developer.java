package com.kn.AssessmentQuestion2;

public class Developer extends Employee {

	public Developer(String name, double salary) 
	{
		super(name, salary);
	}
	public void employeeDetails()
	{
		System.out.println("Developer Details:");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}

}
