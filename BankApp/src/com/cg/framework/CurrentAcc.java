package com.cg.framework;

public class CurrentAcc extends BankAcc {
	private final float CreditLimit=50;
	
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	
	public float getCreditLimit() {
		return CreditLimit;
	}

	public void withdraw(float accBal) {
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [CreditLimit=" + CreditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
