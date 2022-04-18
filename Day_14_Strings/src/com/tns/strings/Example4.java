package com.tns.strings;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// Matching the input string
		String s1=new String("Dhoni");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(s1))
		{
			System.out.println("matching");
		}
		else
		{
		System.out.println("not matching");
	}
		s.close();
	}
}
