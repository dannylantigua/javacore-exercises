public class StringEquality {
	public static void main(String... args) {
		
		// Checking for reference equality
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append(“a”);
		System.out.println(one == two);		// false
		System.out.println(one == three);		// true
		
		String x = “Hello World”;
		String y = “Hello World”;
		System.out.println(x == y);		// true
		String z = “ Hello World”.trim();
		System.out.println(x == z);		// false
		
		String a = new String("Hello World");
		System.out.println(a == y);		// false
		
		// Check for logical object equality
		System.out.println(x.equals(z));		// true
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = t1;
		System.out.println(t1 == t3);		// true
		System.out.println(t1 == t2);		// false
		System.out.println(t1.equals(t2));	// false - still checks for reference equality
	}
}

class Tiger {
	String name;
}