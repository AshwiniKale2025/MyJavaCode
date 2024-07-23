/*1.write a program for remaining methods of string(isempty,lastindexof,replace,replaceall,)  
2.write a program for matches string function for 4 questions given in class 22 i.e  
1.check given string ends with i for string manish kumar tiwari 2.check given string starts with m 
3.check if letter k is present or not 4.check if given string tom,has 3 characters or not(as per class 22)*/

package strings;
public class Assignment_37 
{
	public static void main(String[] args) 
	{
		String a="";
		String b="My Name Is Ashwini";
		String c="Ashwini Only";
		String d="ashwini";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(b.lastIndexOf("A"));
		System.out.println(b.replace('s', 'B'));
		System.out.println(b.replaceAll(b, c));
		System.out.println(b.replaceAll("Ashwini", "Kale"));
		System.out.println(d.replaceAll("[a-q]", ""));
		
		String name="manish kumar tiwari";
		System.out.println(b.replaceAll("[A-Z]", ""));
		System.out.println(name.endsWith("i"));
		System.out.println(name.matches("(.*)i"));
		System.out.println(name.startsWith("m"));
		System.out.println(name.matches("m(.*)"));
		System.out.println(name.contains("k"));
		System.out.println(name.matches("(.*)k(.*)"));
		String a1="tom";
		System.out.println((a1.length()==3));
		System.out.println(a1.matches("..."));
		
	}
}
