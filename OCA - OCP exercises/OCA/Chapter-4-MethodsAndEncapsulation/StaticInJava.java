import java.util.ArrayList;

// Static imports
import java.util.List;
import static java.util.Arrays.asList;		// static import
import static java.util.Arrays;				// Does not compile
static import java.util.Arrays.*;			// Does not compile

// Sample of two members with the same name
import static statics.A.TYPE;
import static statics.B.TYPE;				// Does not compile
	
public class StaticInJava {
	
	private String name = "Static class";
	public static void first() { }
	public static void second() { }
	public void third() { System.out.println(name); }
	
	public static void main(String... args) {
		first();
		second();
		third();	// Does not compile
		
		// Static variables
		NUM_BUCKETS = 5; 	// Does not compile
		values.add("changed");	// Compiles but Java won't allow modification
		
		// Static imports
		List<String> list = asList("one", "two");	// use of Arrays.asList no needed
		Arrays.asList("one");		// Does not compile
	}
	
	// Static variables
	private static int counter = 0;
	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>();
	
	// Static initialization
	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four;		// Does not compile
	static {
		one = 1;
		two = 2;
		three = 3;		// Does not compile
		two = 4;		// Does not compile
	}
}
