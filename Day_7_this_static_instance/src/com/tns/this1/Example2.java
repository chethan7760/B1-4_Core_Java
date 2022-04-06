package com.tns.this1;
public class Example2
{
	int a,b;
	void Display(int a,int b) 
	{
		this.a=a;
		this.b=b;
	}
	void print()
	{
		System.out.println("value of a:"+a);
		System.out.println("Value of b:"+b);
	}

	public static void main(String[] args) 
	{
		Example2 e=new Example2();
		e.Display(10,25);
		e.print();
	}

}
