package textbookExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.print.attribute.standard.JobName;

public class sumRecursion18_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the one number_18.5: ");
		int num = input.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("The result Recursion: " + df.format(mRecursion(num)));
		System.out.println("The result Forloop: " + df.format(mFoorLoop(num)));
	}
	
	public static double mRecursion(int i) {
		
		double result = 0.0;
		double multiPlusNum = 0.0;
		
		if(i == 0) {
			return 0;
		} else {
			multiPlusNum = (2 * i) + 1;
			result =  i / multiPlusNum ;
			
			return result + mRecursion(i -1);
		}
	}
	
	public static double mFoorLoop(int i) {
		
		double result = 0.0;
		double jNum = 0.0;
		double multiPlusNum = 0.0;
		
		if(i == 0) {
			return 0;
		} else {
			for(int j = 1; j <= i; j++) {
				jNum = j;
				multiPlusNum = (2 * jNum) + 1;
				//System.out.println("jNum: " + jNum);
				//System.out.println("multiPlusNum: " + multiPlusNum);
				result += (jNum / multiPlusNum);
				//System.out.println("result: " + result);
			}
			return result;
		}
	}

}
