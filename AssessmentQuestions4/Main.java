package com.kn.AssessmentQuestions4;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int maxNumber=sc.nextInt();
		FibonacciGenerator fg=new FibonacciGenerator(maxNumber);
		fg.generateFibonacciSeries();
		sc.close();
		
	}
}
