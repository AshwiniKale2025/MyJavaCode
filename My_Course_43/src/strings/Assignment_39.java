//Perform array for boolean and double datatype and write down their values from scanner class.
package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_39 
{
	public static void main(String[] args) 
	{
		double percentage[]=new double[3];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter pecentage of student "+(i+1)+" : ");
			percentage [i]=s.nextDouble();
		}
		System.out.println(Arrays.toString(percentage));
		System.out.println();
		
		boolean result[]=new boolean[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter value true/false: ");
			result [i]=s.nextBoolean();
		}
		System.out.println(Arrays.toString(result));
s.close();
	}

}
