
public class Scope {

	public static void main(String[] args) {
		int outer=1;// outer is declared outside the scope so it can be accessed anywhere
		{
			int inner=2; //inner is declared inside the scope hence it is accessed only inside the scope
			System.out.println(inner);//hence it will print the output
			System.out.println(outer);//since outer can be accessed anywhere it will also print
		}
	//System.out.println(inner); it won't print because we can't access inner from outside
		}

	
	}


