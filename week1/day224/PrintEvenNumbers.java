package week1.day224;

import java.util.Iterator;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		// int a = 20;
		// Print the even numbers
		// for loop - to iterate the even numbers
		// if condition needed to check particular number is even
		
		for (int i = 0; i <= 20; i++) {
			
			if(i % 2 == 0) { //(i %2 != 1)
				
				// if(i % 2 == 0 || i==10) // To break when the iteration reaches 10
				
				// break;
				
				System.out.println(i+ " is even");
				
			}
			
		}

	}

}

