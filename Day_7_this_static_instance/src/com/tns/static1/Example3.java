package com.tns.static1;
public class Example3 
{
	static String str;
	static int a;
	static
	{
		str="hello";
		a=10;
	}
	public static void main(String[] args) 
	{
		System.out.println("My name is:"+str);
		System.out.println("My reg no is:"+a);

	}

}
