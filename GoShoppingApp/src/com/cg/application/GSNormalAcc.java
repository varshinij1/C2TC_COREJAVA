package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	public GSNormalAcc(int accNo,String accNum,float charges) {
		super(accNo, accNum, charges);
		// TODO Auto-generated constructor stub
	}
	//private static final float charges =0;
	
	public void bookProduct(float charges){
		
		System.out.println("dear normal user,your chargers are"+charges+"with delivery charges"+getCharges());
	}
		


	

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}	

	
	
	
	


