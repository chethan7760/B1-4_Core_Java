package com.tns.polymorphism;

 class Base {
	void method1()
	{
		System.out.println("parent1");
	}
}
class Derived extends Base
{
	void method1()
	{
		System.out.println("child1");
	}
}
class Parent
{
	public static void main(String[] args) {
		Base b=new Base();
		b.method1();
		Derived d=new Derived();
		d.method1();

	}

}
