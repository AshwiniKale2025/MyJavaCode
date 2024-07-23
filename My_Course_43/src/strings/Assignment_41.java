//Write a program to verify if the given String is a Palindrome (Eg: Madam, Radar, Mom, Wow, Dad)
package strings;

public class Assignment_41 
{
	public static void main(String args[])
	{
     	    String name1="NAYAN";
			String name2="";
			char ch;

			for(int i=0; i<name1.length();i++)
			{
				ch=name1.charAt(i);
				name2=ch+name2;	
			}
			
			if(name2==name1)
			{
				System.out.println("The word "+name1+" is a PALINDROME");
			}	
			else
				System.out.println("The word "+name1+" is NOT a PALINDROME");
	 
	   }
}
