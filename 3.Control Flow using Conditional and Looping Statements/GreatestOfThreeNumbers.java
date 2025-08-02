package MyProject_Day1;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the number:");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.printf("Greatest is: %d",num1);
		}
		else if(num2>num3 && num2>num1) {
			System.out.printf("Greatest is: %d",num2);
		}
		else {
			System.out.printf("Greatest is: %d",num3);
		}
	}
}
