import java.util.Scanner;

public class uzd9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number n  ");
		   int n= reader.nextInt();
		   
		   boolean a = false; 
		   
		   if (n>0){
			   a=true;
			   System.out.print(" rezultatas  "+a);
		   }
		   else if (n<0){
			   a=false;
			   System.out.print(" rezultatas  "+a);
		   }
		
		
	}

}
