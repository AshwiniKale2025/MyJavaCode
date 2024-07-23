package myPackage;
public class MethodOverloading 
{
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
	}
	static void add(double a)
	{
		System.out.println("3");
	}
	static void add(double a, int b)
	{
		System.out.println("4");
	}
	static void add(int a, double b)
	{
		double c=a+b;
		System.out.println("Sum is: "+c);
	}
	static void add(double a, int b, String name)
	{
		System.out.println("6");
	}
	static void add(double a , double b)
	{
		System.out.println("7");
	}
	static void add(boolean a,int b)
	{
		System.out.println("8");
	}
	static void add(char a , double b)
	{
		System.out.println("9");
	}
	static void add(char a, char b, int c, int d, double e)
	{
		System.out.println("11");
	}
	//non-static method
	void add(int a, int b, int c)
	{
		a=0;
		b=0;
		c=0;
		System.out.println("non-static values: "+a+b+c);
	}
	public static void main(String[] args) 
	{
		add();
		add('a',99.1);
		add('a','b',1,2,1.9);
		add(true,1);
		add(9);
		add(7.3,2);
		add(9,1.5);
		add(1.2,9,"Ashwini");
		MethodOverloading m1=new MethodOverloading();
		m1.add(1, 2, 3);
	}
	
}
