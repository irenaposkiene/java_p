import java.util.Scanner;

public class uzd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number x");
		  int x= reader.nextInt();
		  
		  
		  System.out.print("Type a number y");
		  int y= reader.nextInt();
		  
		  
		  int suma= x+y;
		  int atim = x-y;
		  double dal =(double)x/(double)y;
		  int daug = x*y;
		  
		  System.out.print("Atsakymai: "+"\n" + "suma " + suma + "\n" + "atimtis " + atim +"\n" + "dalyba " + dal +"\n" + "daugyba  " + daug);
		  
	}

}
