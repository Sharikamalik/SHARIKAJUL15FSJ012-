package labBook1;
import java.util.Scanner;
public class WhileLoopDemo {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	   
	 int num, sum=0;
	 System.out.println("n Please enter any interger value below 10: ");
	 num = sc.nextInt();
	 
	 while(num <= 10) {
		 sum= sum+num;
		 num++;
	 }
	 System.out.println("Sum of the numbers from the while loop is: "+sum);
 }
}
