package labBook1;
import java.util.Scanner;

public class ArrayInput {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 int[] array = new int[10];
	 int sum=0;
	 System.out.println("Enter the element: ");
	 for (int i=0; i<10; i++)
	 {
		 array[i] = sc.nextInt();
	 }
	 for( int num : array) {
		 sum = sum+num;
	 }
	 System.out.println("Sum of array elements is: "+sum);
	 }
 }

