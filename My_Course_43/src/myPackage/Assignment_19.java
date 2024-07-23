/*Using Scanner Class please execute below problems:
(Area of circle, Circumferance of circle, Area of square, Area of reactangle, 
Area of trinagle, Area of trepezium, Circumferance of square, Circumferance of reactangle, Circumferance of trinagle, 
Circumferance of trepezium)*/

package myPackage;
import java.util.Scanner;
public class Assignment_19 
{
	public static void main(String[] args) 
	{
		//Area of Circle
				double pi=Math.PI;
				Scanner s1=new Scanner(System.in);
				System.out.println("*****************AREA***************");
				System.out.println("Enter the radius: ");
				double r=s1.nextInt();
				double area=pi*r*r;
				System.out.println("AREA OF CIRCLE: "+area);
				System.out.println();
				//Area of Square
				System.out.println("Enter side of square: ");
				int a=s1.nextInt();
				int area1=a*a;
				System.out.println("AREA OF SQUARE IS: "+area1);
				System.out.println();
				//Area of Rectangle
				System.out.println("Enter length of rectangle: ");
				int a2=s1.nextInt();
				System.out.println("Enter breadth of rectangle: ");
				int b2=s1.nextInt();
				int area2=a2*b2;
				System.out.println("AREA OF RECTANGLE IS: "+area2);
				System.out.println();
				//Area of Trapezium
				System.out.println("Enter 1st side of Trapezium: ");
				double a3=s1.nextInt();
				System.out.println("Enter 2nd side of Trapezium: ");
				double b3=s1.nextInt();
				System.out.println("Enter height of Trapezium: ");
				double h=s1.nextInt();
				double area3=0.5 *h*(a3+b3);
				System.out.println("AREA OF TRAPEZIUM IS: "+area3);
				System.out.println();
				

				System.out.println("****************CIRCUMFERENCE/PERIMETER**********************");
				//Circumference of Circle
				System.out.println("Enter the radius for circumference: ");
				int r1=s1.nextInt();
				double circum=2*pi*r1;
				System.out.println("CIRCUMFERENCE OF CIRCLE IS: "+circum);
				System.out.println();
					
				//Perimeter of Square
				System.out.println("Enter side of square: ");
				int b=s1.nextInt();
				int circum1=4*b;
				System.out.println("PERIMETER OF SQUARE IS: "+circum1);
				System.out.println();
				
				//Perimeter of Rectangle
				System.out.println("Enter lenght of rectangle: ");
				int l=s1.nextInt();
				System.out.println("Enter breadth of rectangle: ");
				int b5=s1.nextInt();
				int periRectangle=2*l*b5;
				System.out.println("PERIMETER OF RECTANGLE IS: "+periRectangle);
				System.out.println();
				
				//Perimeter of Trapezium
				System.out.println("Enter 1st side of Trapezium: ");
				int side1=s1.nextInt();
				System.out.println("Enter 2nd side of Trapezium: ");
				int side2=s1.nextInt();
				System.out.println("Enter 3rd side of Trapezium: ");
				int side3=s1.nextInt();
				System.out.println("Enter 4th side of Trapezium: ");
				int side4=s1.nextInt();
				int periTrapezium=(side1*side2)+(side2*side3)+(side3*side4)+(side1*side4);
				System.out.println("PERIMETER OF TRAPEZIUM IS: "+periTrapezium);
				System.out.println();
				
		s1.close();		
	}
}
