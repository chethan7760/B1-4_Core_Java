package com.tns.oops;

public class Constructor {
	String str;
	int a;
	Constructor(String s,int x)
	{
		str=s;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	public static void main(String[] args) 
	{
		Constructor c=new Constructor("welcome",11);
		c.display();
	
		// TODO Auto-generated method stub
		

	}

}
