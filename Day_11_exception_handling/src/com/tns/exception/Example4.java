package com.tns.exception;

public class Example4 {
	static void display(int age,int weight)
	{
		if (age>18 && weight>50)
		{
			System.out.println("you are eligibale to donate blood");
		}
		else
		{
			throw new ArithmeticException("not eligibale");
	}
	}
	public static void main(String[] args) 
	{
		display(16,55);
		System.out.println("exception handled");

	}

}
