package computeFactorial;

import java.util.Scanner;

public class PlusExample {

	public static void main(String[] args) {
		  // Create a Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a non-negative integer: ");
	    int n = input.nextInt();
	    
	    // Display factorial
	    System.out.println("The sum  of " + n + " is " + sumNumber(n));
	  } //finish the main method
	
	public static long sumNumber(int n) {
		
		if(n == 0) {
			return 0;
		} else {
			return n + sumNumber(n-1);
		}
	}
}
