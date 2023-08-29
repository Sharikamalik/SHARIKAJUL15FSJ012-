package labBook1;
import java.util.Scanner; 
public class OddOrEven {
  public static void main(String[]args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num = input.nextInt();
	  
	  if (num % 2 == 0)
		  System.out.println("This is even number");
	  else 
		  System.out.println("This is odd number");
		  
  }
}
