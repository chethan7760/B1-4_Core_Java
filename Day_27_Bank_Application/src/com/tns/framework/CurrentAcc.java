package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void withdraw(float accBal) {
	
		System.out.println("Account no is "+this.getAccNo()+"   Account Name is   "+this.getAccNm()+ "  "+"accBal is "+  (accBal+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s, toString()=%s]",
				creditLimit, super.toString());
	}
	
	

}