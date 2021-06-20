// Inheritance follow IS-A relationship
// Parent referance can used to hold Child class Object. But it doesn't used to call child class methods.  eg:- Parent p = new child()
// Child class refernce doesn't hold Parent class Object. Eg:- Child c = new Parent() *********(NOT ALLOWED)*******
// Object class act as root for all java classes.
// Java class can't extends more than one class at a time.


package OOPS;

class Base{
	 int a;
	 
	 Base()
	 {
		 System.out.println("Inside constructor");
		 System.out.println(this.hashCode());
	 }
	 
	 public void m1()
	 {
		 System.out.println("Yhis is m1 Method");
		 
	 }
}

public class Inheritance extends Base{
	
	 public void m2()
	 {
		 System.out.println("This is m2 Method");
		 System.out.println(this.hashCode());
	 }
	 
	 public static void main(String args[])
	 {
		 Inheritance hg = new Inheritance();
		 //b.m2();											// can't access child method with parent class refernce
		 hg.m2();
	 }
}
