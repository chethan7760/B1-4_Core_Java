package com.tns.stringbuffer;

public class Example3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Try");
		System.out.println(sb);
		sb.setCharAt(3,'x');
		System.out.println(sb);
		}
}
