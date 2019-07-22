package sorting;

import java.util.Scanner;

public class SqrtError {

	public static void main(String[] args) {
		String chars = null;
		double doubleNumber = 9.9;
		
			try{
			 System.out.print("Enter your number : ");
			 
			 Scanner scan = new Scanner(System.in);
			 chars = scan.next();
			 
			 doubleNumber = Double.parseDouble(chars);
			 
			 System.out.println("The square root of "+doubleNumber+" is : "+doSqrt(doubleNumber));

			}catch(NumberFormatException e){
				System.out.println(e.getMessage()+" this program cannot function! Please enter a real number. ");
			}

			
		System.out.println("Bye!");

	}

	public static double doSqrt(double doubleNumber) {
		
		return Math.sqrt(doubleNumber);
		
	}

}
