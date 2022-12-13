package com.cg.framework;

public abstract class NormalAcc extends ShopAcc {
	final private	float DeliveryCharges = 50;
	 
	 public NormalAcc(int accNo, String accNum, float charges) {
		super(accNo, accNum, charges);
		
	}

	
	public float getDeliveryCharges() {
		return DeliveryCharges;
	}


	@Override
public void bookProduct(float charges) {
		
	}
	@Override
	public String toString() {
		return "NormalAcc [DeliveryCharges=" + DeliveryCharges + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
