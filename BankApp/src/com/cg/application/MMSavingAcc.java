package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float accBal=0;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	public void withdraw(float accBal) {
		System.out.println("dear customer,your saving account balance is"+accBal+"with creditlimit"+getCreditLimit());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public float getCreditLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
