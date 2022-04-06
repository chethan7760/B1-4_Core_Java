package com.tns.this1;
public class Example1 
{
	String str;
	public Example1(String str) 
	{
		this.str=str;
	}

	public static void main(String[] args) 
	{
		Example1 e=new Example1("Welcome");
		System.out.println(e.str);
	}

}
