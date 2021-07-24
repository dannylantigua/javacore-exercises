public class BasicForStatement {
	public static void main (String... args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		// 1. Infinite Loop
		for ( ; ; ) {
			System.out.println("Hello World");
		}
		
		// 2. Multiple terms in the for statement
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		
		// 3. Redeclaring a variable in the initialization block.
		int x = 0;
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // Does not compile
			System.out.print(x + " ");
		}
		// The correct way:
		int x = 0;
		long y = 0;
		for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(x + " ");
		}
		
		// 4. Using incompatible data types in the initialization block
		for (long y = 0, int x = 4; x < 5 && y < 10; x++, y++) { // Does not compile
			System.out.print(x + " ");
		}
		
		// 5. Using lopp variables outside of the loop
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x); // Does not compile
		
	}
}