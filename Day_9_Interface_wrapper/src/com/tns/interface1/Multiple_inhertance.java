package com.tns.interface1;

interface Multiple_inhertance {
	void getcar();
}
 interface Multiple_inhertance1 {
	void getbike();
}
class Vehical1 implements  Multiple_inhertance,  Multiple_inhertance1 
{
public	void getcar()
	{
		System.out.println("this is car");
	}
public	void getbike()
{
	System.out.println("this is bike");
}
	public static void main(String args[])
	{
		Vehical1 v=new Vehical1();
		v.getcar();
		v.getbike();
	}
	
	}