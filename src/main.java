import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class main {

	public static void main(String [] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle: ");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of Rectangle: ");
		double width = scanner.nextDouble();
		
		double area  = length*width;
		System.out.println("Area of Rectangle is: "+area);
		
		System.out.println(" Would You like to find the area of another rectangle? Y, N ");
		 
		
		double Length2 = scanner.nextDouble();
		
		System.out.println("Enter the length of Rectangle: ");
		double width2 = scanner.nextDouble();
		System.out.println("Enter the width of Rectangle:"+area);
		
		
		
		
	
	}
	
	
}
