import java.util.Scanner;

public class uzd6 {

	  public static void main(String args[]){
	       Scanner input = new Scanner( System.in );
	       System.out.print("Enter a binary number 1: ");
	       String binaryString1 =input.nextLine();

	       int x= Integer.parseInt(binaryString1,2);
	       
	       System.out.print("Enter a binary number 2: ");
	       String binaryString2 =input.nextLine();

	       int y= Integer.parseInt(binaryString2,2);
	       
	       int suma = x+y;
	       
	       
	       System.out.println("Answer: "+Integer.toBinaryString(suma));
	    }

}
