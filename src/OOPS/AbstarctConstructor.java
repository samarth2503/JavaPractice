/* why we need Constructor in abstract class when abstract class cannot be initalized 
 * 
 * 		Suppose parent class have some varibale to initalize that variable we need constructor.
 * 		Variable present in parent(abstract) class can be initalized in child class using constructor through inheritance.  
 * 		If we have 1000 methods in parent(abstract) class then it be initalized in child class using constructor through inheritance.
 * 		If we have 1000 sub class extending parent(abstract) which have 1000 variable ,then each subclass will contains duplicate code.	
 * 		To overcome this abstract constructor cam into picture
 * 
 */

package OOPS;

abstract class Student
{
	int rollno;
	String name;
	
	Student(int rollno,String name)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	public String getStudentDetails()
	{
		return "Name is "+name+ " and rollno is "+rollno;
	}
}


public class AbstarctConstructor extends Student{
	
	int marks;
	

	public AbstarctConstructor(int rollno, String name,int marks) {
		super(rollno, name);
		// TODO Auto-generated constructor stub
	}
	
	public String getStudentDetails()
	{
		return "Name is "+name+ " and rollno is "+rollno+ "Marks";
	}
	
	public static void main(String[] args)
	{
		Student st = new AbstarctConstructor(23,"Samarth",45);
		System.out.println(st.getStudentDetails());
	}

}
