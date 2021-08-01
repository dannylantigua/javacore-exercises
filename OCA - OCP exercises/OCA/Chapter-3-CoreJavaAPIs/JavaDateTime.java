import java.time.*

public class JavaDateTime {
	public static void main(String... args) {
		
		System.out.println(LocalDate.now());		// YYYY-MM-DD
		System.out.println(LocalTime.now());		// hh:mm:ss.000
		System.out.println(LocalDateTime.now());	// YYYY-MM-DDThh:mm:ss.000
		
		// Declaring LocalDate
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		// Declaring LocalTime
		LocaTime time1 = LocaTime.of(6, 15);
		LocaTime time2 = LocaTime.of(6, 15, 30);
		LocaTime time3 = LocaTime.of(6, 15, 30, 200);
		
		// Creating LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		// Constructors are private for Date and Time classes
		// These are public static implementations
		LocalDate d = new LocalDate();     // Does not compile
		
		LocalDate.of(2015, Month.JANUARY, 32);	// throws DateTimeException
		
		// Dates and Times are immutable
		LocalDate today = localDate.of(2021, Month.AUGUST, 1);
		System.out.println(today);
		today = today.plusDays(2);
		System.out.println(today);
		today = today.plusWeeks(1);
		System.out.println(today);
		today = today.plusMonths(1);
		System.out.println(today);
		today = today.plusYears(5);
		System.out.println(today);
		
		LocalDate date = LocalDate.of(2020, Month.MARCH, 20);
		LocalTime time = LocalTime.of(5,15);
		LocalDateTime dateTime = LocalDateTime.of(date, time)
			.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime);
		
	}
}
