package com.tns.inheritance;

class Cellphones
{
	void message()
	{
		System.out.println("hi a");
	}
	void call()
	{
		System.out.println("hi b");
	}
}

class SamsungGalaxy extends Cellphones
{
	void facelock()
	{
		System.out.println("hi c");
	}
}
class Oneplus extends Cellphones
{
	void game()
	{
		System.out.println("hi p");
	}
}
public class Hierchicalinheritance {

	public static void main(String[] args)
	{
		Oneplus o=new Oneplus();
		o.game();
		o.call();
		o.message();
		SamsungGalaxy m=new SamsungGalaxy();
		m.facelock();
	}

}
