package computeFactorial;

import java.util.Scanner;

public class ComputeFactorial {

	public static void main(String[] args) {
		  // Create a Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a non-negative integer: ");
	    int n = input.nextInt();
	    
	    // Display factorial
	    System.out.println("Factorial of " + n + " is " + factorial(n));
	    
	  } //finish the main method

	
	  /** Return the factorial for a specified number */
	  public static long factorial(int n) {
	    if (n == 0) // Base case => terminate the condition
	      return 1;
	    else
	      return n * factorial(n - 1); // Recursive call => call itself
	  }


}
