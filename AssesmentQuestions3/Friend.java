package com.kn.AssesmentQuestions3;

public class Friend extends User
{
	public Friend(String name,int age)
	{
		super(name,age);
	}
	public void manageFriend()
	{
		System.out.println("Friend Information:");
		System.out.println("User "+name+" ,"+" Age "+age);
		System.out.println(name+" is your Friend.");
	}
}
