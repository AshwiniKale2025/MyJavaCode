package myPackage;

public class Conditional_Operator 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		int c=40;
		 if(a>b)     //false
		 {
			 System.out.println("1"); 
		 }
		if(b<c)     //true
		{
			System.out.println("2");
		}
		if(a>=b)   //false
		{
			System.out.println("3");
		}
		if(a<=b)    //true
		{
			System.out.println("4");
		}
		if(a==b)   //false
		{
			System.out.println("5");
		}
		if(a!=c)    //true
		{
			System.out.println("6");
		}
	}
}
