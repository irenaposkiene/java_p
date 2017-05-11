import java.util.Scanner;

public class uzd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	System.out.print("Hello, choose one of the Geometry shapes:"+"\n"+
		 "Rectangle" +"\n"+ "Triangle" +"\n"+ "Square"+"\n"+ "Circle" +"\n" );
				
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Type a name of shape:  ");
		
		String shape = reader.nextLine();
		
		if (shape.toUpperCase().equals("RECTANGLE") || shape.toUpperCase().equals("SQUARE")){
			 
			System.out.print("Type a size of one side :  ");
			
			   double a= reader.nextDouble();
			   
			System.out.print("Type a size of another side :  ");
				
			   double b= reader.nextDouble();
			   
			 System.out.print("Area of is " + (a+b) + "of "+ shape);
			
		}
		
		else if (shape.toUpperCase().equals("TRIANGLE")){
			 
			System.out.print("Type a size of one side :  ");
			
			   double a= reader.nextDouble();
			   
			System.out.print("Type a size of height :  ");
				
			   double b= reader.nextDouble();
			   
			 System.out.print("Area of is " + (1/2*(a*b))+ "of "+ shape);
			
		}
		 
		else if (shape.toUpperCase().equals("CIRCLE")){
			 
			System.out.print("Type a size of radius :  ");
			
			   double a= reader.nextDouble();
			   
						   
			 System.out.print("Area of is " + (Math.PI * (a * a)) + "of "+ shape);
			
		}
		
		else System.out.print("none " );
		   
	}

}
