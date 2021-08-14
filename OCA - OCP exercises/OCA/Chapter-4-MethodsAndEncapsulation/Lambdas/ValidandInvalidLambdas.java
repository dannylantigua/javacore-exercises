public class ValidandInvalidLambdas {
	
	public static void main(String... args) {
		// These examples are related to Animal and TraditionalSearch java classes
		print(() -> true);
		print(a -> a.startsWith("test"));
		print((String a) -> a.startsWith("test"));
		print((a, b) -> a.startsWith("test"));
		print((String a, String b) -> a.startsWith("test"));
		
		print(a, b -> a.startsWith("test"));					// Does not compile
		print(a -> { a.startsWith("test"); });					// Does not compile
		print(a -> { return a.startsWith("test") });			// Does not compile
		
		print((a, b) -> { int a = 0; return 5; });				// Does not compile
		print((a, b) -> { int c = 0; return 5; });
		
	}
}