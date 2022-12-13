package com.cg.framework;

public abstract class ShopAcc {
	protected int accNo;
	protected String accNum;
    protected float charges;
   

public ShopAcc(int accNo, String accNum, float charges) {
	super();
	this.accNo = accNo;
	this.accNum = accNum;
	this.charges = charges;
}

public int getAccNo() {
	return accNo;
}



public String getAccNum() {
	return accNum;
}

public void setAccNum(String accNum) {
	this.accNum = accNum;
}

public float getCharges() {
	return charges;
}



public void bookProduct(float charges){
	
}
public void items(float charges) {
	
}
@Override
public String toString() {
	return "ShopAcc [accNo=" + accNo + ", accNum=" + accNum + ", charges=" + charges + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}