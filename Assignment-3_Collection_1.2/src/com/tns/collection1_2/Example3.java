package com.tns.collection1_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		Set s=new LinkedHashSet();
		s.add(11);
		s.add(10);
		System.out.println(s);

	}

}