class Employee2 {
	int id;
	String name;
	float salary;

	
void display() {
	System.out.println(id+" "+name+" "+salary);
}
Employee2 (int i, String n, float s) {
	id=i;
	name=n;
	salary=s;
}

}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Employee2 e2=new Employee2(101,"john",10.0f);//parameterized constructor
		Employee2 e3=new Employee2(0, null, 0);
		e2.display();
		e3.display();
         
	}

}
