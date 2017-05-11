import java.util.Scanner;

public class uzd10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number n  ");
		   int n= reader.nextInt();
		   
		   System.out.print("Diapazonas nuo   ");
		   int x= reader.nextInt();
		   
		   System.out.print("Diapazonas iki   ");
		   int y= reader.nextInt();
		   
		   boolean a = false; 
		   
		   if (x<n && n<y){
			   a= true;
			   System.out.print( a + " n= " + n + " x= "+x + "y= "+ y + "skaicius priklauso diapazonui");
		   }
		   else {
			   a= false;
			   System.out.print(a + " n= " + n + " x= "+x + "y= "+ y + "skaicius nepriklauso diapazonui");
		   }
	}

}
