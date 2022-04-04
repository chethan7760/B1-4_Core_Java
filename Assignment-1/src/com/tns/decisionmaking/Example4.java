package com.tns.decisionmaking;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) 
	{
	
				Scanner s=new Scanner(System.in);
				String str=s.nextLine();
				switch(str)
				{
				case "one":
					System.out.println("hi");
					break;
				case "two":
					System.out.println("Hello");
					break;	
				case "three":
					System.out.println("welcome");
					break;
				default:
					System.out.println("Invalid input");
					s.close();
				}

			}

		


	}


