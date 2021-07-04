// do not compile this java file
// sample of variables being candidates to be garbage collected

public class Scope {
	public static void main (String... args) {
		String one, two, three;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		one = null
	}
}

// when one = two, the value "b" does not have any pointers
// when three = two, three points to "a"
// one = null, one is a candidate to be garbage collected
