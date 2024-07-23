//Utilise All methods of scanner class
package myPackage;
import java.util.Scanner;
public class Assignment_18 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Assignment number: ");
		int assign=s.nextInt();
		System.out.println("Enter value of pi: ");
		double d=s.nextDouble();
		System.out.println("Enter any decimal number: ");
		float f=s.nextFloat();
		System.out.println("Enter the age: ");
		short sh=s.nextShort();
		System.out.println("Enter 1 to 10: ");
		long l=s.nextLong();
		System.out.println("Enter sningle digit: ");
		byte b=s.nextByte();
		System.out.println("Enter Your name: ");
		String st=s.next();
		System.out.println("Enter True/False: ");
		boolean bl=s.nextBoolean();
		
		s.close();
	}

}

