package labBook1;
import java.util.Scanner;
public class FindAreaOfTriangle {
 public static void main(String[]args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter width of Triangle");
	 double width = sc.nextDouble();
	 System.out.println("Enter height of Triangle");
	 double height = sc.nextDouble();
	 double area=(width*height)/2;
	 System.out.println("Area of Triangle is "+area);
 }
}
