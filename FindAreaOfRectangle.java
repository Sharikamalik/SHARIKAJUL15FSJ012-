package labBook1;
import java.util.Scanner;
class FindAreaOfRectangle {
   public static void main(String[]args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle");
	   double length = sc.nextDouble();
		   System.out.println("Enter the width of Rectangle");
		   double width = sc.nextDouble();
		   double area = length*width;
		   System.out.println("Area of rectangle is "+area);
	   }
   }

