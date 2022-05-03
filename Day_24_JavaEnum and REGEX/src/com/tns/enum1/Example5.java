package com.tns.enum1;

public class Example5 {
	enum Day
	{
		sunday,monday,tuesday,wednesday,thursday,friday,saturday
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d=Day.monday;
		printDisplay(d);
	}
		public static void printDisplay(Day d)
		{
			if(d==Day.saturday)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same");
				
			}
		}

	}

