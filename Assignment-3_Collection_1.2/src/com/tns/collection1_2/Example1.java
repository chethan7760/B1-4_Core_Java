package com.tns.collection1_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(11);
		q.offer(10);
		q.add(12);
		q.offer(20);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.remove(11));
		System.out.println(q);
	}

}