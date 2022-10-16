
public class IncrementOperator {

	public static void main(String[] args) {
		int numA=8;
		int numB=6;
		int numC=4;
		numC=--numA+numB--;//--numA=7+numB=6 ie 7+6=13
		System.out.println(numA);//now numA=7
		System.out.println(numB);//now numB is decremented so numB=5
		System.out.println(numC);//13
	}

}
