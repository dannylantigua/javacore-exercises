public class AnotherOverloadingSample {
	
	public static String glide(String s) {
		return "1";
	}
	
	public static String glide(String... s) {
		return "2";
	}
	
	public static String glide(Object o) {
		return "3";
	}
	
	public static String glide(String s, String t) {
		return "4";
	}
	
	// Sample of too many conversions
	public static void play(Long l) {}
	public static void play(Long... l) {}
	
	public static void main(String... args) {
		System.out.println(glide("a"));
		System.out.println(glide("a", "b"));
		System.out.println(glide("a", "b", "c"));
		
		// Sample of too many conversions
		play(4);		// Does not compile
		play(4L);		// Calls the Long version
	}
}