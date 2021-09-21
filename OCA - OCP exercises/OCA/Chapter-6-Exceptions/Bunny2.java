class NoMoreCarrotsException extends Exception {}

public class Bunny2 {
	
	public static void main(String... args) {
		// code
	}
	
	public void bad() {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) { // Does not compile
			System.out.println("sad rabbit");
		}
	}
	
	public void good() throws NoMoreCarrotsException {
		eatCarrot();
	}
	
	private static void eatCarrot() { }
}

/* Java knows that eatCarrot() can't throw a checked exception -- which
means there's no way for the catch block in bad() to be reached.
In comparison, good() is free to declare other exceptions.
*/