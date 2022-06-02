package textbookExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class sumResurcaion18_4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the one number: ");
		double intNum = input.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		//df.setRoundingMode(RoundingMode.DOWN);
		//df.setRoundingMode(RoundingMode.UP);
		System.out.println("The result Resursion: " + df.format(mRecursion(intNum)));
		System.out.println("The result Forloop: " + df.format(mForloop(intNum)));
		
	}
	
	public static double mRecursion(double i) {
		
		if(i == 1 ) {
			return 1;
		} else {
			return ( 1 / i) + mRecursion(i-1);
		}
	}
	
	
	public static double mForloop(double i) {
		
		double sumNum = 1.0;
		
		if(i == 1) {
			return 1;
		} else {
			for(int j = 2; j <= i; j++) {
				double jValue = j;
				//System.out.println("j: " + j);
				//System.out.println("fraction" + jValue);
				sumNum += 1 / jValue;
				//System.out.println("the sumNum: " + sumNum);
			}
			
			return sumNum;
		}
	}

}
