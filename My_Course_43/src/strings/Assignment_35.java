/*Write a program for all methods of String length,lowercase,uppercase,indexofchar,charAt(index),trim,equals,
equalsignorecase,contains,substring(start index),substring(startindex,endindex)      (as per class 21)*/

package strings;
public class Assignment_35 
{
	public static void main(String[] args) 
	{
		String name="Ashwini";
		String name2="Ashwini";
		String name3="ashwini";
		int count=name.length();
		System.out.println("count is: "+count);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		String address="abT013nu9k";
		System.out.println(address.charAt(5));
		String name1="        I am perfect              ";
		System.out.println(name1);
		System.out.println(name1.trim());
		System.out.println(address.equals(name));
		System.out.println(name.equals(name2));
		System.out.println(name2.equalsIgnoreCase(name3));
		System.out.println(address.contains("T0"));
		System.out.println(address.substring(2));
		System.out.println(address.substring(2, 5));
	}
}
