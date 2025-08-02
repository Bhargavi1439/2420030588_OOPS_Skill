package MyProject_Day1;

import java.util.*;

public class palindrome {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
		 String str=sc.nextLine();
		 StringBuilder sb=new StringBuilder(str);
		 sb.reverse();
		 if(str.contentEquals(sb))
			 System.out.println("String is a palindrome");
		 else
			 System.out.println("String is not palindrome");
	}
}
