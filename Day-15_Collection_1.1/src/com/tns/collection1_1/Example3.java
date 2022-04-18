package com.tns.collection1_1;

import java.util.LinkedList;

public class Example3 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList obj =new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(56.89);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(10);
		System.out.println(obj);
		System.out.println(obj.size());
		
		LinkedList obj1 =new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj1.add(3);
		obj1.addAll(12,obj1);
		System.out.println(obj1);
	}

}
