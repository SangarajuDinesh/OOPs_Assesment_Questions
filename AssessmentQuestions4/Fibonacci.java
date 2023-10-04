package com.kn.AssessmentQuestions4;

public class Fibonacci 
{
	int maxNumber;

	public Fibonacci(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public void generateFibonacciSeries()
	{
		System.out.print("Fibonacci series upto "+maxNumber+":");
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int sum=0;
		while(maxNumber>0)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
			maxNumber--;
		}
	}
}
