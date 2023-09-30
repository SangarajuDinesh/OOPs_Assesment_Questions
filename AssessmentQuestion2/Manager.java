package com.kn.AssessmentQuestion2;

public class Manager extends Employee 
{

	public Manager(String name, double salary)
	{
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	public void employeeDetails()
	{
		System.out.println("Manager Details:");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
}
