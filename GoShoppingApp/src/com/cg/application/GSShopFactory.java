package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
PrimeAcc acc1;
NormalAcc acc2;
	
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNum, float charges, boolean isPrime) {
		acc1 =new GSPrimeAcc(accNo,accNum,charges,isPrime);
		
		return acc1;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNum, float charges) {
		acc2 =new GSNormalAcc(accNo,accNum,charges);
		
		return acc2;
	}

}
