package com.tns.collection1_1;

import java.util.ArrayList;

public class Example2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Object cloneList;
		al.add("Tech");
		al.add("java");
		System.out.println(al);
		cloneList=al.clone();
		System.out.println(cloneList);
	}

}