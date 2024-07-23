//static non-parameterized method calling
package myPackage;

public class method_call 
{
	public static void addition()
	{
		System.out.println("The addition method has been created and calling inside the main method");
	}
	public static void main(String[] args) 
	{
		addition();
		System.out.println("Called in main method");
	}
}
