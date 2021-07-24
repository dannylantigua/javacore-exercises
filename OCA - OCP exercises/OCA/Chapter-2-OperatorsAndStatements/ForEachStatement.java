public class ForEachStatement {
	public static void main (String... args) {
		
		// Sample 1
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
			System.out.print(name + " ");
		}
		
		// Sample 2
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
			System.out.print(value + ", ");
		}
		
		// Sample 3
		String names = "Lisa";
		for(String name : names) { // Does not compile
			System.out.print(name + " ");
		}
		
		// Sample 4
		String[] names = new String[3];
		for(int name : names) { // Does not compile
			System.out.print(name + " ");
		}
	}
}