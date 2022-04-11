package com.tns.jaggedarray;

public class Example1 {

	public static void main(String[] args)
	{
		int a[][]= new int[2][];
		a[0]=new int[3];
		a[1]=new int[2];
		int add=11;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				 a[i][j]=add++;
			}
		}
		
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
				
			}
		}

	
	}

