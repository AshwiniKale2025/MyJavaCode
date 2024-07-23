/*Write a program to make a form where the user is able to input his information. The following information is required:
(First name, Email, Password, Gender, Present address, Permanent address, Pin code) */

package myPackage;
import java.util.Scanner;
public class Assignment_16
{
	public static void main(String[] args) 
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String name=s1.next();
		System.out.println("Enter Email ID: ");
		String email=s1.next();
		System.out.println("Password: ");
		String pswd=s1.next();
		System.out.println("Enter Your Gender (M/F/C): ");
		String gen=s1.next();
		System.out.println("Enter Present Address: ");
		String paddr=s1.next();
		System.out.println("Enter Parmanent Address: ");
		String add=s1.next();
		System.out.println("Enter PIN Code: ");
		int pin=s1.nextInt();
		
		
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Email ID: "+email);
		System.out.println("Password: "+pswd);
		System.out.println("Gender: "+gen);
		System.out.println("Present Address: "+paddr);
		System.out.println("Permanent Address: "+add);
		System.out.println("PIN Code: "+pin);
	s1.close();
		
		}
	

}
