package com.tns.abst;

class Animal2
{  
	Animal2()
	{	
		System.out.println("animal is created");
	}  
}  
class Dog extends Animal2
{  
	Dog()
	{  
		super();  
		System.out.println("dog is created");
	}
}  
public class Super_constr
{  
	public static void main(String[] args)
	{  
		Dog d=new Dog();
	}
}  
