package com.tns.oops;

public class Nonparameterized {


	String str;
	int a;
	Nonparameterized()
	{
		str="welcome";
		a=11;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	public static void main(String[] args) 
	{
		Nonparameterized c=new Nonparameterized();
		c.display();
	
		// TODO Auto-generated method stub
		

	}


}
