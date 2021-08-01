import java.time.*

public class FormattingDatesAndTimes {
	public static void main(String... args) {
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 24);
		LocalDateTime dataTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		// 2020-01-20
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		// 11:12:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		// 2020-01-20T11:12:34
		
		// Applying SHORT format
		DateTimeFormatter shortDateTime = DateTimeFormatter
			.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime));	// 1/20/20
		System.out.println(shortDateTime.format(date));	// 1/20/20
		System.out.println(shortDateTime.format(time));	// UnsupportedTemporalTypeException
		
		// This also is valid
		System.out.println(dateTime.format(shortDateTime));	// 1/20/20
		System.out.println(date.format(shortDateTime));	// 1/20/20
		System.out.println(time.format(shortDateTime));	// UnsupportedTemporalTypeException
		
		// Applying MEDIUM format
		DateTimeFormatter mediumDateTime = DateTimeFormatter
			.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortDateTime.format(dateTime));		// 1/20/20
		System.out.println(mediumDateTime.format(dateTime));	// Jan 20, 2020 11:12:34 AM
		
		// Your own format
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f));		// January 20, 2020, 11:12
		
		// Parsing String to Date
		f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate strToDate = LocalDate.parse("01 02 2015", f);
		LocalTime strToTime = LocalTime.parse("11:22");
		System.out.println(strToDate);
		System.out.println(strToTime);
		
	}
}