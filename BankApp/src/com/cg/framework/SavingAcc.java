package com.cg.framework;

public class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float CreditLimit = 2000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.setSaving(isSalaried);
	}
	
	public static float getCreditlimit() {
		return CreditLimit;
	}

	public void withdraw(float accBal) {
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSaving(boolean isSalaried) {
		this.isSalaried=isSalaried;
	}
	

}
