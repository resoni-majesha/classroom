package week1.day221;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		// int[] num = new int[3];
		
		/*
		 * num[0] = 10; num[1] = 20; num[2] = 30; // num[3] = 40;
		 * 
		 * System.out.println(num.length); System.out.println(num.length - 1);
		 * 
		 * System.out.println(num[1]); System.out.println(num[0]);
		 * 
		 * System.out.println(num[num.length - 1]);
		 */
		
		/*
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * System.out.println(num[i]);
		 * 
		 * }
		 */	
		
		/*
		 * // To print in reverse order
		 * 
		 * for (int i = num.length - 1; i >= 0; i--) {
		 * 
		 * System.out.println(num[i]); }
		 */
	
		int[] num = {45, 95, 55};
		
		Arrays.sort(num);
		
		/*
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * System.out.println(num[i]); }
		 */
		
		for (int i = num.length -1; i >= 0; i--) {
			
			System.out.println(num[i]);
		}
	}

}
