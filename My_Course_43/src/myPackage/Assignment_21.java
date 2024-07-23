//Multi level inheritance for Non-static method
package myPackage;

class Grandfather1
	{
		public void Villa()
		{
			System.out.println("The Big Villa is mine....");
		}
	}
	class father1 extends Grandfather1
	{
		public void Flat()
		{
			System.out.println("The Flat is mine");
		}
	}
	class mother1 extends father1
	{
		void Car()
		{
			System.out.println("The Car is mine");
		}
	}	
	public class Assignment_21 extends mother1
	{
		public static void main(String[] args) 
		{
		mother1 m=new mother1();
		m.Villa();
		m.Flat();
		}
	}

