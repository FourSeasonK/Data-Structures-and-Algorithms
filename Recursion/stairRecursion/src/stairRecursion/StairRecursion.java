package stairRecursion;

import java.util.Scanner;

public class StairRecursion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of stair: ");
		int num = input.nextInt();
		System.out.println("The stair case is " + staircase(num));

	}
	
	public static int staircase(int n) {
		
		if(n == 1) {
			return 1;
		}else {
			return staircase(n-1) + staircase(n-2);
		}
		
//		int result = 0;
//		int numPre1 = 1;
//		int numPre2 = 1;
//		
//		for(int i = 0; i <= n; i++) {
//			
//			if(i == 1) {
//				result = 1;
//				
//			} else {
//				result = numPre1  + numPre2;
//				System.out.println("turn: " + i);
//				System.out.println("numPre1: " + numPre1);
//				System.out.println("numPre2: " + numPre2);
//				System.out.println("result: " + result);
//
//				numPre1 = numPre2;
//				numPre2 = result;
//			}
//		}
//		
//		return result;	
	}

}
