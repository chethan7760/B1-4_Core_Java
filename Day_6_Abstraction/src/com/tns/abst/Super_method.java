package com.tns.abst;

class Vehical
{
	void car() 
	{
		
		System.out.println("benz");
		
	}
}
class Bike extends Vehical 
{
	void bike()
	{
		System.out.println("pulsar");
		super.car();
	}
	
}
public class Super_method
{

	public static void main(String[] args) {
		Bike b=new Bike();
		b.bike();

	}

}
