package com.cg.client;



import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;

public class Client {
	public static void main(String[] args) {
MMBankFactory factory=new MMBankFactory();
MMSavingAcc msa=(MMSavingAcc)factory.getNewSavingAcc(101,"SBI",5.5f,true);
msa.withdraw(msa.getCreditLimit());
MMCurrentAcc mca=(MMCurrentAcc)factory.getNewCurrentAcc(102,"ICICI",50.f,58.8f);
mca.withdraw(mca.getCreditLimit());
}
}
