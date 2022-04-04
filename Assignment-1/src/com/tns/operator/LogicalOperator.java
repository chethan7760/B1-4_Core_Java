package com.tns.operator;
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int a=c.nextInt();
		int b=c.nextInt();
		boolean res=a<b && b>a;
		boolean res1=a>b || b>a;
		boolean res2=!(b<a);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		c.close();
		

	}

}
