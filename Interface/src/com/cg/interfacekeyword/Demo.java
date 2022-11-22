package com.cg.interfacekeyword;
interface Triangle{
	public void Area(int b,int l);
}

public class Demo {

	public static void main(String[] args) {
		Triangle t= (int b,int h)->{System.out.println(0.5*b*h);};
		t.Area(10, 10);
				}

}
