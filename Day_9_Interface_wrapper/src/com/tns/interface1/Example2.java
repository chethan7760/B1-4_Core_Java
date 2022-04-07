package com.tns.interface1;

public interface Example2 {
	 void display1();
	 	void print1();
		
}
class Main2 implements Example2
{
public	void display1()
	{
		System.out.println("hello,everyone");
	}
public	void print1()
{
	System.out.println("hello,everyone,bye");
}
	public static void main(String args[])
	{
		Main2 m=new Main2();
		m.display1();
		m.print1();
	}
}