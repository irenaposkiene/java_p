

import java.util.Scanner;

public class uzd1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

			
		int sk=-1;
		int s=0;
		
		System.out.print("Type a number");
		sk= reader.nextInt();
		
		
		while (sk>0){
			int liekana= sk%10;
			sk=sk/10;
			
			s=s+liekana;
			
		}System.out.print("Atsakymas: "+s);
		
		}

	

	}


