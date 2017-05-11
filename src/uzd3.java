import java.util.Scanner;

public class uzd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number x");
		  int x= reader.nextInt();
		  
		  
		  System.out.print("Type a number y");
		  int y= reader.nextInt();
		  
		  double dalrez = (double)x/(double)y;
		  double dalliek = (double)x*(double)y;
		  
		  System.out.print("Daugybos ats.: "+dalrez +" Dalybos ats.: " + dalliek);
		  
		  
		  
		  
		  
	}

}
