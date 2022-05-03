package com.indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("I");
		Matcher m=p.matcher("I live in Mumbai and I");
		while(m.find())
		{
			System.out.println("pattern found from" +m.start()+ " to " +(m.end()-1));
		}

	}

}
