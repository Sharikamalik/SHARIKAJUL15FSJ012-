package labBook1;

public class CastingExercise {
   public static void main(String[]args) {
	   byte b= 10;
	   int i =b;
	   byte c=i;
	   byte d=(byte)i;
	   
	   byte x= 10;
	   byte y= 20;
	   
	   byte sum=x*y; //error because two byte in arithematic operation, the result will be in integer 
	                 // int sum=x*y;
   }
}
