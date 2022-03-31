package com.tns.oops;

public class Car1
{
	String str;
	Car1(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("This is "+str);
	}
	public static void main(String[] args) 
	{
		Car1 a=new Car1("Audi");
		Car1 a1=new Car1("Benz");
		Car1 a2=new Car1("BMW");
		a.print();
		a1.print();
		a2.print();
		
		// TODO Auto-generated method stub

	}

}
