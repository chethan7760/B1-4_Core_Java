package com.tns.stringbuilder;

public class Example2 {
	public static void main(String []args) {
		String s = "Tomorrow";
		StringBuffer sb = new StringBuffer(s.length());
		System.out.println(sb.capacity());
		}
}
