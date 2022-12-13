package com.cg.framework;

public abstract class BankAcc {
	protected int accNo;
	protected String accNm;
	protected float accBal;
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public int getACCNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public String setAccNm(String accNm) {
		return accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void withdraw(float accBal) {
		
	}
	public void deposite(float accBal) {
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}