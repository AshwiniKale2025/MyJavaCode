//Write a Program to reverse a string using iteration

package strings;

import java.util.Scanner;

public class Assignment_43 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String name;
		String reverse="";
		System.out.println("Enter the word: ");
		name=s.next();
		char ch;
		
		for(int i=0; i<name.length();i++)
		{
			ch=name.charAt(i);
			reverse=ch+reverse;
			
		}
		System.out.println("Reverse Name of "+name+" is: "+reverse);
	s.close();
	}
	
}
