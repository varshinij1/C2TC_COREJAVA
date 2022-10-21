
public class Object {
	String name="jack";
	int age=28;
	char gender='m';
	String country="Indian";
	public int id;
	
	void display() {
		System.out.println(name+" "+age+" "+gender+" "+country);
	}

	public static void main(String[] args) {
	
     Object o=new Object();//creating an object by using new keyword
           String name=o.name;
           int age=o.age;
           char gender=o.gender;
           String country=o.country ;
               o.display();
	}

}
