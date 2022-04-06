package com.tns.abst;
final class Example12
{
	 void display()
	{
		System.out.println("Hello");
	}
}
public class Example4 extends Example12 
{
	 void display()
	    {
	    	
	    	System.out.println("Welcome");
	    }


	public static void main(String[] args) {
		Example4 e=new Example4();
		e.display();
	}

}
