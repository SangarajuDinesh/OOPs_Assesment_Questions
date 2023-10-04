package com.kn.AssesmentQuestions3;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		if(in==1)
		{
			String name=sc.next();
			int age=sc.nextInt();
			Friend f=new Friend(name,age);
			f.manageFriend();
		}
		else if(in==2)
		{
			String name=sc.next();
			int age=sc.nextInt();
			Follower f1=new Follower(name,age);
			f1.manageFollower();
		}
		sc.close();
	}
}
