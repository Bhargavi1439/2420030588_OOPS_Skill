package MyProject_Day1;

import java.util.Scanner;

public class SumOfDigitsOfaNumber {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		        
		    System.out.print("Enter an integer: ");
		    int number = sc.nextInt();
            int original = number;

	        int sum = 0;
		     
	        while (number != 0) {
		          int digit = number % 10;  
		          sum += digit;             
		          number /= 10;             
		        }
            System.out.println("Sum of digits of " + original + " is: " + sum);
	}
}
