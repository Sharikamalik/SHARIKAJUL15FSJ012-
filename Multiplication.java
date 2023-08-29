package labBook1;
import java.util.Scanner;

public class Multiplication {
   public static void main(String[]args) {
	   Scanner scan =new Scanner(System.in);
	   
	   System.out.println("Enter value for a:  ");
	   int a = scan.nextInt();
	   
	   System.out.println("Enter value for b:  ");
	   int b=scan.nextInt();
	   
	   int mul=a*b;
	   
	   System.out.println("The multiplication of a and b is: "+mul);
	}
}
