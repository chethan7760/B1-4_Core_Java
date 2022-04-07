package com.tns.interface1;


class Main implements Example1
{
public	void display()
	{
		System.out.println("hello,everyone");
	}
public	void print()
{
	System.out.println("hello,everyone,bye");
}
	public static void main(String args[])
	{
		Main m=new Main();
		m.display();
		m.print();
	}
}
