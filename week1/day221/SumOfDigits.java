package week1.day221;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int input = 123;
		
		int sum = 0;
		
		while (input > 0) {
			
			int rem = input % 10; 
			
			sum = sum + rem;
			
			input = input /10; 
			
		}
		
		System.out.println(sum);

	}

}
