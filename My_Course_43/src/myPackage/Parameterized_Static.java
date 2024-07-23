//Review Homework
package myPackage;
public class Parameterized_Static
{
	static void add(int a, int b)
	{
		int add=a+b;
		System.out.println("Addition is :"+add);
	}
	static void add(int a, int b, String name)
	{
		System.out.println(a+b+name);
	}
	void sub(double a, int b)
	{
		System.out.println("Subtraction "+ (a-b));
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	
	public static void main(String[] args) 
	{
		add(190,10);
		add(9,5," Ashwini");
		mul();
		Parameterized_Static s1=new Parameterized_Static();
		s1.div();
		s1.sub(1200.50,100);
	}
}
//Homework= parameter with Boolean and char