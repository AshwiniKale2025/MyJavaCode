//Calling non-static method inside the main method by creating an object
package myPackage;

public class Non_static_Method
{
	void add()                                //non-static method
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 

	{
		//Steps:
		//create an object
		//syntax of creating an object is
		//classname reference_variable=new classname();
		//reference_variable.non-static_method_name();
		
		Non_static_Method l1=new Non_static_Method(); //object created with reference variable as l1
		l1.add();
		l1.sub();
	}
}
