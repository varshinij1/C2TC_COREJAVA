package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public  class MMBankFactory extends BankFactory {
	CurrentAcc acc1;
	SavingAcc acc2;
	public SavingAcc  getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried) {
		acc2=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return acc2;
	}
	public CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal) {
		acc1=new MMCurrentAcc(accNo,accNm,accBal);
		return acc1;
	}
	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		acc2=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return acc2;
	
	}
	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float CreditLimit) {

		acc1=new MMCurrentAcc(accNo,accNm,accBal);
		return acc1;
	// TODO Auto-generated method stub
		
	}

	
}
