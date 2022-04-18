package com.tns.collection1_2;

import java.util.ArrayDeque;

public class Example2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Hello");
		System.out.println(a);
		a.addFirst(10);
		a.addLast("Last");
		System.out.println(a);
	}

}