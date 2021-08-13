public class MethodOverloading {
	
	// Method overloading basic samples
	public void fly(int numMiles) {}
	public void fly(short numFeet) {}
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) {}
	public void fly(short numFeet, int numMiles) throws Exception {}
	
	public int fly(int numMiles) {}			// Does not compile
	public static void fly(int numMiles) {}	// Does not compile
	
	// Overloading varargs
	public void fly2(int[] lengths) {}
	public void fly2(int... lengths) {}		// Does not compile
	
	// Reference types
	public void fly(String s) {
		System.out.print("string ");
	}
	
	public void fly(Object o) {
		System.out.print("object ");
	}
	
	// Primitive Types
	public void flyAgain(int t) {
		System.out.print("int ");
	}
	
	public void flyAgain(long L) {
		System.out.print("long ");
	}
	
	public static void main(String... args) {
		
		MethodOverloading r = new MethodOverloading();
		// Calling varargs
		r.fly2(new int[] {1, 2, 3});		// Valid for array and varargs
		r.fly2(1, 2, 3);					// Valid only for varargs
		
		// Calling reference types
		r.fly("test");
		r.fly(56);
		// At the end, "string object " gets printed
		
		// Calling primitive types
		r.flyAgain(123);
		r.flyAgain(123L);
		// At the end, "int long " gets printed
	}
}
