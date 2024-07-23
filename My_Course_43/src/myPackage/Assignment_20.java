//Multi level inheritance for static method
package myPackage;

class Grandfather
{
	static void Villa()
	{
		System.out.println("The Villa is mine");
	}
}
class father extends Grandfather
{
	static void Flat()
	{
		System.out.println("The Flat is mine");
	}
}
class mother extends father
{
	static void Car()
	{
		System.out.println("The Car is mine");
	}
}	
public class Assignment_20 extends mother
{
	public static void main(String[] args) 
	{
		Villa();
		Flat();
		Car();
	}
}
