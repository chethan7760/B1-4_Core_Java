package com.tns.collection1_1;

import java.util.Stack;

public class Example5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.pop();
		System.out.println(s);
	}

}