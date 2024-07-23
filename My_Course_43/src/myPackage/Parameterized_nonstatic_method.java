package myPackage;

public class Parameterized_nonstatic_method 
{

	void add(int a, int b)  //non-tatic parameterized method
	{
		int sum=a+b;
		System.out.println("Sum1 is: "+sum);
	}
	
	void add(double a, int b)
	{
		double sum=a+b;
		System.out.println("Sum2 is: "+sum);
	}
	void subtract()       //non-static non-parameterized method
	{
		System.out.println("Sum3 is");
	}
	
	public static void main(String[] args) 

	{
		Parameterized_nonstatic_method p1=new Parameterized_nonstatic_method();
		p1.add(100.5, 200);
		p1.add(15.30, 12);
		p1.subtract();

	}
}
