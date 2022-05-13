package datetime;
import java.time.LocalDate;
import java.util.Scanner;
public class timedate2 {
	public static void main (String args[]) {
		LocalDate date=LocalDate.ofEpochDay(365);
		
		System.out.println(date);
	}
}
