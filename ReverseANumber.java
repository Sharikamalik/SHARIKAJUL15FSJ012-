package labBook1;
import java.util.Scanner;
public class ReverseANumber {
 public static void main(String[]args) {
	 Scanner re =new Scanner(System.in);
	 int num = 0 , reversenum =0;
	 System.out.println("Type number and press enter");
	 num =re.nextInt();
	 while(num != 0) {
		 reversenum = reversenum*10;
		 reversenum= reversenum+ num%10;
		 num = num/10;
	 }
	 System.out.println("Reverse of input number is "+reversenum);
	 
	 }
		 
 }

