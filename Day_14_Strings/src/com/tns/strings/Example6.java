package com.tns.strings;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// concat method
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		//System.out.println( 10+20+"hello  " + "  world  " + 10+20);
		System.out.println(str1.concat(str2));
		s.close();
		
	}

}
