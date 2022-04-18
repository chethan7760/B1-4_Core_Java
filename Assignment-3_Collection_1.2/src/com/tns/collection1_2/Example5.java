package com.tns.collection1_2;

import java.util.HashMap;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {
		Map<Integer,String>s=new HashMap<Integer,String>();
		s.put(1,"hi");
		s.put(2, null);
		s.remove(1);
		System.out.println(s);
		//System.out.println(s.firstEntry());
	}

}