package com.cg.application;
import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges =0;
	public GSPrimeAcc(int accNo, String accNum, float charges, boolean isPrime) {
		super(accNo, accNum, charges, isPrime);
		// TODO Auto-generated constructor stub
	}


	
	
	public void bookProduct(float charges) {
		System.out.println("Dear prime user,your product charges are"+getCharges()+"shipping charges"+getDeliveryCharges());
	}
	

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	

	


	
	

}
