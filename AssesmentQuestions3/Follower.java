package com.kn.AssesmentQuestions3;

public class Follower extends User
{
	public Follower(String name,int age)
	{
		super(name,age);
	}
	public void manageFollower()
	{
		System.out.println("Follower Information:");
		System.out.println("User "+name+" ,"+" Age "+age);
		System.out.println(name+" is your follower.");
	}
}
