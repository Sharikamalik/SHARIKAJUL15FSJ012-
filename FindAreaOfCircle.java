package labBook1;
import java.util.Scanner;
public class FindAreaOfCircle {
 public static void main(String[]args) {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter the radius");
	 double radius =obj.nextDouble();
	 double area = Math.PI*(radius*radius);
	 System.out.println("Area of circle is " +area);
	 double circumference= Math.PI * 2*radius;
	 System.out.println("The circumference of the circle is: "+circumference);
	 
 }
}
