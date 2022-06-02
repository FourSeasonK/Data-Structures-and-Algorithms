package textbookExercises;

import java.util.Scanner;

public class sumRecursion_18_7 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the one number: ");
	int number = input.nextInt();
	System.out.println("The mForloop: " + mForloop(number));
	

	}
	
//	public static double mRecursion(int i) {
		
//}
	
	public static double mForloop(int i) {
		
		double result = 0.0;
		double jNum = 0.0;
		double underNume = 0.0;
		
		if(i == 0) {
			return 0;
		} else {
			for(int j = 1; j <= i; j++) {
				jNum = j;
				underNume = j + 1;
				result += jNum / underNume;
				System.out.println("result : " + result);
			}
			
			return result;
		}
		
	}

}
