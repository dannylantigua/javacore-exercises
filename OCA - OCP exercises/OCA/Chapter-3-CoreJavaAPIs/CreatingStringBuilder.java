public class CreatingStringBuilder {
	public static void main(String... args) {
		
		// Sample of inefficient String
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++)
			alpha += current; // This creates a new object each iteration
		System.out.prinln(alpha);
		
		// Sample of efficient String
		StringBuilder alpha = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++)
			alpha.append(current); // This adds the char to the same object
		System.out.prinln(alpha);
		
		// Mutability and chaining
		StringBuilder a = new StringBuilder(“abc”);
		StringBuilder b = a.append(“de”);
		B = b.append(“f”).append(“g”);
		System.out.println(“a=” + a);
		System.out.println(“b=” + b);
		// Both print “abcdefg” as they reference to the same object.
		
		// Three ways to instance a StringBuilder
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10); // This size is merely a suggestion
	}
}