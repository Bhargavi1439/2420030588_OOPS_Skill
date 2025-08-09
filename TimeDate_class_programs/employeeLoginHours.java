package MyProject_Day1;
import java.time.*;

public class employeeLoginHours {
	public static void main(String args[]) {
		LocalTime start=LocalTime.of(9, 0);
		LocalTime end=LocalTime.of(18, 0);
		LocalTime login=LocalTime.of(9, 15);
		LocalTime logout=LocalTime.of(17, 45);
		LocalTime current=LocalTime.now();
		System.out.printf("Current time: %s%n ", current);
		
		if(!login.isBefore(start) && !logout.isAfter(end)) {
			System.out.printf("Employee logged in during office hours.");
		}
		else
			System.out.printf("Employee didn't log in during office hours.");
		
		Duration duration = Duration.between(login, logout);
		long hours=duration.toHours();
		long minutes=duration.toMinutes();
		long seconds=duration.toSeconds();
		System.out.println("Duration: " + hours + " hours " + minutes + " minutes " + seconds + " seconds ");
	}
}
