package com.cg.interfacekeyword;

interface Inf1 {
	public void method11();
}
 class Demo implements Inf1 {
	public void method1() {
		System.out.println("method1");
	}
	

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.method1();
		
	}


	@Override
	public void method11() {
		System.out.println("method2");
	}

}
