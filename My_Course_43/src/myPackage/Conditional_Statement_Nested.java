package myPackage;

public class Conditional_Statement_Nested
{
public static void main(String[] args) 
{
	char gender_1='M';
	char gender_2='F';
	int age_kid=4;
	int age_adult_male=32;
	int age_adult_female=30;
	
	if(gender_1=='M')
	{
		if(age_kid<=4)
		{
			System.out.println("Ticket is free");
		}
		else
		{
			System.out.println("Full ticket");
		}
	}
	else
	{
		System.out.println("Ticket is Free for Females");
	}
			
}
}
