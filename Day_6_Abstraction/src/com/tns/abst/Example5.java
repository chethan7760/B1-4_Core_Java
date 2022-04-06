package com.tns.abst;
class A
{
	String name="Dhoni";
}
class B extends A
{
	String name="Kohli";
	void print()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("Hi, I am "+super.name);

	}
}
public class Example5 {

	public static void main(String[] args) {
		B b=new B();
		b.print();
	

	}

}
