package com.tns.enum1;
enum Bike
{
	Pulsar,KTM,R15,R3
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b;
		b=Bike.Pulsar;
		switch(b)
		{
		case Pulsar:
			System.out.println("You chose Pulser");
			break;
		case KTM:
			System.out.println("You chose KTM");
			break;
		case R15:
			System.out.println("You chose R15");
			break;
		case R3:
			System.out.println("You chose R3");
			break;
			default:
			System.out.println("invlaid name");
		
		}

	}

}
