package myPackage;

public class Static_NonStatic 
{
	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
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
		add();
		mul();
		Static_NonStatic s1=new Static_NonStatic();
		s1.div();
		s1.sub();
	}
}
