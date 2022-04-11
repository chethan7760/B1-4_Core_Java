package com.tns.polymorphism;

public class Overloading1 
{
	void assign(int a,int b)
	{
		System.out.println("Area of rectangle: " +(a*b) );
	}
	void assign(float a,float b)
	{
		System.out.println("Area of rectangle: " +(float) (a*b) );
	}

	public static void main(String[] args)
	
	{
		Overloading o=new Overloading();
		o.assign(5,10);
		o.assign(10f,20f);
		

	}

}

	

	