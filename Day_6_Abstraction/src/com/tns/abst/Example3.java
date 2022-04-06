package com.tns.abst;
class Example11
{
	final void display()
	{
		System.out.println("Hello");
	}
}
public class Example3 extends Example11 
{
	 void display()
	    {
	    	
	    	System.out.println("Welcome");
	    }

	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.display();
	}

}
