package com.tns.enum1;
interface Pizza
{
	public void print();
}
enum size implements Pizza
{
	small,medium,large,extralarge;
	public void print()
	{
		System.out.println("size is: "+this);
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size.extralarge.print();
	}

}
