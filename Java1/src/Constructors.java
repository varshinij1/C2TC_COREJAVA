class Employee {
	int id;
	String name;
	float salary;
	
}
public class Constructors {

	public static void main(String[] args) {
          Employee e1=new Employee();//default constructors
          
          e1.id=101;
          e1.name="john";
          e1.salary=10.f;//because it is floating point number
          System.out.println(e1.id+" "+e1.name+" "+e1.salary);
	}

}
