import java.util.ArrayList;

public class Initializers {
	// Initialization
	private static int counter = 0;						// can change
	private static final int NUM_BUCKETS = 45;			// cannot change, constant
	private static final ArrayList<String> values = new ArrayList<>();		// cannot change, constant
	
	public static void main(String... args) {
		NUM_BUCKETS = 5; 		// Does not compile
		values.add("changed");	// Compile, but Java won't allow to modify variable
	}
}