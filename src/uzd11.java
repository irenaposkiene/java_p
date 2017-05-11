import java.util.Scanner;

public class uzd11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Hello, choose one of the currency to change to EUR: USD , GBP , PLN ");
		
		
		Scanner reader = new Scanner(System.in);
		

		System.out.print("Type a currency:  ");
		
		String currency = reader.nextLine();
		 
		System.out.print("Type a number of currency:  ");
		   double sk= reader.nextDouble();
		   
		    if (currency.toUpperCase().equals("USD")){
		   double eur= sk * 0.941398;
		   System.out.print("in Euro it is " + eur);
		   
		   }
		    else if (currency.toUpperCase().equals("GBP")){
			 double eur= sk * 1.15763921766;
			 System.out.print("in Euro it is " + eur);
				   
				   }
		    
		    else if (currency.toUpperCase().equals("PLN")){
				 double eur= sk * 0.232327;
				 System.out.print("in Euro it is " + eur);
					   
					   }
		    
		   else {
			   
			   System.out.print(" none" );
			   
		   }
	}

}
