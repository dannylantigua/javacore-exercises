public class SwitchStatement {
	public static void main(String... args) {
		
		int dayOfWeek = 5;
		switch(dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
	}
	
	private int getSortOrder(String firstName, final String lastName) {
		
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		switch(firstName) {
			case "Test":
				return 52;
			case middleName: // does not compile
				id = 5;
				break;
			case suffix:
				id = 0;
				break;
			case lastName: // does not compile
				id = 8;
				break;
			case 5: // does not compile
				id = 7;
				break;
			case 'J': // does not compile
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY: // does not compile
				id = 15;
				break;
		}
		return id;
	}
}