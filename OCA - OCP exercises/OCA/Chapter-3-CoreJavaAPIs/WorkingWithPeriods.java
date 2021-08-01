import java.time.*

public class WorkingWithPeriods {
	public static void main(String... args) {
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start, end, period);
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.plus(period));	// 2015-02-20
		System.out.println(dateTime.plus(period));	// 2015-02-20T06:15
		System.out.println(time.plus(period));	// UnsupportedTemporalTypeException
	}
	
	public static void performAnimalEnrichment(LocalDate start,
		LocalDate end, Period period) {
		
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
	
}