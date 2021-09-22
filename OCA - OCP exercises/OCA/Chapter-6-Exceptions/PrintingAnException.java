public class PrintingAnException {
	
	public static void main(String... args) {
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}

// Output:

/*

java.lang.RuntimeException: cannot hop

cannot hop

java.lang.RuntimeException: cannot hop
at trycatch.Handling.hop(Handling.java:14)
at trycatch.Handling.main(Handling.java:5)

*/