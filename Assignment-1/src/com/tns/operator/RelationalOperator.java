package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		int a=c.nextInt();
		int b=c.nextInt();
		boolean res=a>b;
		boolean res1=a<b;
		boolean res2=a==b;
		boolean res3=a>=b;
		boolean res4=a<=b;
		boolean res5=a!=b;
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		c.close();
	}

}
