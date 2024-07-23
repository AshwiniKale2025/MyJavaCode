//Write a Program to copy one array in to another array using iteration
package strings;

public class Assignment_42 
{
	public static void main(String[] args) 
	{            
		int [] array1 = new int [] {1, 2, 3, 4, 5,6,7};        
		int array2[] = new int[array1.length];    
   
		System.out.println("Array1 is: ");    
		for (int i = 0; i < array1.length; i++) 
		{     
			System.out.print(array1[i] + " ");    
		}     
       
		for (int i = 0; i < array1.length; i++) 
		{     
			array2[i] = array1[i];     
		}  
		
		System.out.println();    
       
		
		System.out.println("Array2 is: ");    
		for (int i = 0; i < array2.length; i++) 
		{     
			System.out.print(array2[i] + " ");    
		}     
}    
	
}
