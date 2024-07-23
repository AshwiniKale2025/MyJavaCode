package inheritencePrograme;
class State_Class
{
	State_Class()
	{
		System.out.println("State Class Constructor");
	}
}
public class City_Class extends State_Class
{

	City_Class()
	{
		super();                                //super calling statement can be present implicitly/explicitly
		System.out.println("City Class Constructor");
	}
	public static void main(String[] args) 
	{
		new City_Class();
	}
}

