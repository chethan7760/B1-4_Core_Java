package com.tns.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("shashank");
		a.add("shashi");
		System.out.println(a);
		//a.add(20);
		//String s=a.get(1);
		//System.out.println(s);
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
