class Employee1 {
	int id;
	String name;
	float salary;

public void initialize(int i,String n,float s) {
	id=i;
	name=n;
	salary=s;
	System.out.println(id+" "+name+" "+salary);
}
Employee1 () {     //user defined constructor
	System.out.println("User defined no argument Constructor");
}
	
}
public class UserDefinedConstructor {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.initialize(101,"John",10.0f);//user defined constructor

	}

}
