package com.cg.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accNum,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo,String accNum,float charges);

}
