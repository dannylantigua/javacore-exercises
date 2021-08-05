public class DesigningMethods {
	
	// Method declaration
	public final void nap(int minutes) throws
		InterruptedException {
			// take a nap
	}
	
	// Access Modifiers samples
	public void walk() {}
	default void walk2() {}		// Does not compile
	void public walk3() {}		// Does not compile
	void walk4() {}
	
	// Optional Specifiers samples
	public void walk1() {}
	public final void walk2() {}
	public static final void walk3() {}
	public final static void walk4() {}
	public modifier void walk5() {}			// Does not compile
	public void final walk6() {}			// Does not compile
	final public void walk7() {}
	
	// Return Type samples
	public void walk1() {}
	public void walk2() { return; }
	public String walk3() { return ""; }
	public String walk4() {}			// Does not compile
	public walk5() {}					// Does not compile
	String walk6(int a) { if (a == 4) return ""; 0} // Does not compile
	int integerExpanded() { int temp = 9; return temp; }
	int integer() { return 9; }
	
	// Method Name samples
	public void walk1() {}
	public void 2walk() {}		// Does not compile
	public walk3 void() {}		// Does not compile
	public void Walk_$() {}
	public void() {}			// Does not compile
	
	// Parameter list
	public void walk1() {}
	public void walk2 {}		// Does not compile
	public void walk3(int a) {}
	public void walkk(int a; int b) {}	// Does not compile
	public void walk5(int a, int b) {}
	
	// Optional Exception List
	public void zeroExceptions() {}
	public void oneException() throws IllegalArgumentException {}
	public void twoExceptions() throws
		IllegalArgumentException, InterruptedException {}
		
	// Method body
	public void walk1() {}
	public void walk2();		// Does not compile
	public void walk3(int a) { int name = 5; }
	
}