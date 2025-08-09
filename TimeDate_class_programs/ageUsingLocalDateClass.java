package MyProject_Day1;
import java.util.Scanner;
import java.time.*;


public class ageUsingLocalDateClass {
	public static void main(String args[]) {
	//LocalDate DOB=LocalDate.of(2005, 02, 01);
	Scanner sc= new Scanner(System.in);
	LocalDate current=LocalDate.now();
	System.out.println("Enter the year");
	int year=sc.nextInt();
	System.out.println("Enter the month");
	int month=sc.nextInt();
	System.out.println("Enter the date");
	int date=sc.nextInt();
	
	LocalDate DOB=LocalDate.of(year, month, date);
	Period Age=Period.between(DOB, current);
	
	int years=Age.getYears();
	int months=Age.getMonths();
	int days=Age.getDays();
	
	System.out.println("Age is: " + years + " years " + months + " months " + days + " days ");
	}
}
