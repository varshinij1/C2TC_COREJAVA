
public class Student {
	int rollno;
	String name;
	
	void insert(int r,String n ) {
		rollno=r;
		name=n;
	}
	void Display()
	{
		System.out.println(rollno +" "+name);
	}
	

	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insert(111,"jack");
		s2.insert(222,"Ram");
		s1.Display();
		s2.Display();

	}

}
