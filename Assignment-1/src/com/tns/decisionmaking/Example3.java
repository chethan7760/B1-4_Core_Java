package com.tns.decisionmaking;

public class Example3 {

	public static void main(String[] args) 
	{
		int age=15,weight=55;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible to bungee jumping");
				}
				else
				{
					System.out.println("extra rope will be added");
				}
			}
				else
				{
					System.out.println(" not Eligible to bungee jumping");
				}
		}
		else
		{
			System.out.println(" not Eligible to bungee jumping");
		}
				
				
			}
		}