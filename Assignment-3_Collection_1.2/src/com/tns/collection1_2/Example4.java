package com.tns.collection1_2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example4 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		SortedSet s=new TreeSet();
		s.add(2);
		s.add(5);
		s.add(10);
		System.out.println(s);
	}

}