package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
public class GSClient {
	public static void main(String[] args) {
		GSShopFactory factory=new GSShopFactory();
		GSNormalAcc gsn=(GSNormalAcc)factory.getNewNormalAccount(101,"john", 600.0f);
		gsn.bookProduct(gsn.getCharges());
		GSPrimeAcc gsp=(GSPrimeAcc)factory.getNewPrimeAccount(109,"Jack", 500.0f,true);
		gsp.bookProduct(gsp.getCharges());
	}

}

