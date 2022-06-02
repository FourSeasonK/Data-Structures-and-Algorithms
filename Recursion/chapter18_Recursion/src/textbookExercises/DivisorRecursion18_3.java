package textbookExercises;

import java.util.Scanner;

public class DivisorRecursion18_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = input.nextInt();
		
		//int result = gcd(num1, num2);
		System.out.println("The result is " + gcd(num1, num2));
	}
	
	public static int gcd(int m, int n) {
		
		if(m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}
	}

}
