class NoMoreCarrotsException extends Exception {}

public class Bunny {
	
	public static void main(String... args) {
		eatCarrot() // Does not compile
	}
	private static void eatCarrot() throws NoMoreCarrotsException { }
}

/* Ways to fix it:

1)
public static void main(String... args) throws
	NoMoreCarrotsException {
		eatCarrot();
}

2)
public static void main(String... args) {
	try {
		eatCarrot() // Does not compile
	} catch (NoMoreCarrotsException e) {
		System.out.println("sad rabbit");
	}
}
*/