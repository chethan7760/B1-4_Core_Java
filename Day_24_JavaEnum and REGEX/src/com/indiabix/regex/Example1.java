package com.indiabix.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String pattern="Raina";
		String input=s.next();
		boolean Result=Pattern.matches(pattern, input);
		System.out.println(Result);
		s.close();
	}
	

}
