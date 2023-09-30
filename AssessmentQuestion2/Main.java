package com.kn.AssessmentQuestion2;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name1=sc.next();
		double salary1=sc.nextDouble();
		String name2=sc.next();
		double salary2=sc.nextDouble();
		Manager mn=new Manager(name1, salary1);
		mn.employeeDetails();
		Developer dv=new Developer(name2, salary2);
		dv.employeeDetails();
		sc.close();
	}
}
