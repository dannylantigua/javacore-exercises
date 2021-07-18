public class ifThenStatements {
	public static void main(String... args) {
		
		int hourOfDay = 10;
		// If statement
		if (hourOfDay < 11)
			System.out.println("Good Morning");
		
		// If-then-else statement
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
		
		// If-then-else statement example of unreachable code
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Good Evening");
		}
		
	}
}