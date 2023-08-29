package labBook1;
import java.util.Scanner;
class FindAreaOfSquare {
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the side of Square");
	  double side = sc.nextDouble();
	  double area = side*side;
	  System.out.println("Area of square is "+area);
	  
  }
}
