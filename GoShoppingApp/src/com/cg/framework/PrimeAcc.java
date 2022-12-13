package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc  {
	private boolean isPrime;
	static final private float DeliveryCharges=0;
public PrimeAcc(int accNo, String accNum, float charges, boolean isPrime) {
		super(accNo, accNum, charges);
		this.setPrime(isPrime);
	}
public float getDeliveryCharges()
{
	return DeliveryCharges;
}

	public void bookProduct(float charges) {
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime= isPrime;
	}
	

}
