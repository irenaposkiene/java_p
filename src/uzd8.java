import java.util.Scanner;

public class uzd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number n  ");
		   int n= reader.nextInt();
		   
		   int m = 80;
		   
			   
		   if (n<m){
			   
			   System.out.print("Atsakymas skirtumas  "+(m-n));
		   }
		   else if (n>m){
			   
			   System.out.print("Atsakymas kvadratas " + Math.pow(n,2));
		   }
		   
		   
	}

}
