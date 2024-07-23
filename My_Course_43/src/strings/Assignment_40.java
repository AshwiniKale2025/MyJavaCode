//Write a program to Perform String Reversal
package strings;

public class Assignment_40 
{
	public static void main(String[] args) 
	{
		String name="Ashwini";
		String name1="";
		char ch;
		System.out.println("The name is: "+name);
		
		for(int i=0; i<name.length();i++)
		{
			ch=name.charAt(i);
			name1=ch+name1;
			
		}
		System.out.println("Reverse Name of "+name+" is: "+name1);
	}
	
}
