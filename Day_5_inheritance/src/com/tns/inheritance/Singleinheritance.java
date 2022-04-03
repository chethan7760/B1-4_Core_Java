package com.tns.inheritance;

class Master

	{
	void print()
	{
	System.out.println("Hello,This is me ");
	}
	}
	class Child extends Master
	{
		void display()
		{
			System.out.println("singleinheritance");
		}
	}
class Singleinheritance
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.print();
		c.display();
		
	}
}

