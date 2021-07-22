public class TernaryOperator {
	public class void main(String[] args) {
		
		// If then statements
		int y = 10;
		int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		
		// Ternary Operator
		int z = (y > 5) ? (2 * y) : (3 * y);
		
		// Another example
		System.out.println((y > 5) ? 21 : "Zebra");
	}
}