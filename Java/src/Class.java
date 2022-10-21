
public class Class {//class
	// instance variable
	int x=10;
	int y=18;
	String name="john";
	float salary=10.0f;
	
	void Display() {// display method
		System.out.println("I love Class");
	}

	public static void main(String[] args) {
		Class c=new Class();//object
		c.Display();//calling a display function
		

	}

}
