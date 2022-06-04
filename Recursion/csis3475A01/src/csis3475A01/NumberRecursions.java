/**
 * 
 */
package csis3475A01;

import java.util.Scanner;

public class NumberRecursions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check = true;
		int number = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		while(check) {
			number = input.nextInt();
			if(number > -1) {
				check = false;
			} else {
				System.out.print("Please Enter a non-negative integer again: ");
			}
		}
		
		//call the powerOfTwo method
		int powerNumRecursion = powerOfTwo(number);
		int powerNumForloop = powerOfTwoWithForloop(number);
		System.out.println();
		System.out.println("The result of powerOfTwo with recursion: " + powerNumRecursion);
		System.out.println("The result of powerOfTwo with for-loop: " + powerNumForloop);
		System.out.println();
		
		//call the sumToN method
		int sumNumberRecursion = sumToN(number);
		int sumNumberForloop = sumToNWithForloop(number);
		System.out.println();
		System.out.println("The result of sumToN with recursion: " + sumNumberRecursion);
		System.out.println("The result of sumToN with for-loop: " + sumNumberForloop);
		System.out.println();
			
		//call the sumToN method
		int factorialNumberResursion = factorial(number);
		int factorialNumberForloop = factorialWithForloop(number);
		System.out.println();
		System.out.println("The result of factorial with recursion: " + factorialNumberResursion);
		System.out.println("The result of factorial with for-loop: " + factorialNumberForloop);
		System.out.println();
		
		//call the sumToN method
		int fibonacciNumberRecursion = fibonacci(number);
		int fibonacciNumberForloop = fibonacci(number);
		System.out.println();
		System.out.println("The result of fibonacci with recursion: " + fibonacciNumberRecursion);
		System.out.println("The result of fibonacci with for-loop: " + fibonacciNumberForloop);


	}
	
	//Recursive version of powerOfTwo
	public static int powerOfTwo(int n) {
		
		if(n == 0) {
			return 1;
		} else if(n == 1) {
			return 2;
		} else {
			return 2 * powerOfTwo(n-1);
		}	
	}
	
	//for loop version of powerOfTwo
	public static int powerOfTwoWithForloop(int n) {
		
		int result = 2;
		
		if(n == 0) {
			return 1;
		} else if(n == 1) {
			return 2;
		} else {
			for(int i = 2; i <= n; i++) {
	
				result = 2 * result;
				//System.out.println("result var: " + result);
			}
			return result;
		}
	}
	
	
	//Recursive version of sumToN
	public static int sumToN(int n) {
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return n + sumToN(n-1);
		}
	}
	
	//for loop version of sumToN
	public static int sumToNWithForloop(int n) {
		
		int sumNum = 0; 
		
		for(int i = 0; i <= n; i++){
			sumNum += i;
			//System.out.println("sumNum var: " + sumNum);
		}
		return sumNum;
	}
	
	
	//Recursive version of factorial
	public static int factorial(int n) {
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
		
	}
	
	//for loop version of factorial
	public static int factorialWithForloop(int n) {
		
		int facNum = 1;
		
		if(n == 0) {
			return 0;
		}
		
		for(int i = 1; i <= n; i++) {
			facNum *= i;
			//System.out.println("facNum var: " + facNum);
		}
		return facNum;
	}
	
	
	//Recursive version of fibonacci
	public static int fibonacci(int n) {
		
		if(n == 0) {
			return 0;
		} else if (n == 1){
			return 1;
		} else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
		
	}
	
	//for loop version of fibonacci
	public static int fibonacciWithForloop(int n) {
			
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		for(int i = 0; i < n-1; i++) {
		
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		
		}
		return num3;
	}
	
	

}//ending class
