import java.util.Arrays;

public class JavaArray {
	public static void main(String... args) {
		
		// Primitive type declarations
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[] {42, 55, 99}; // right-hand side redundant
		int[] numbers2 = {42, 55, 99};
		
		// Same thing:
		int[] variable; 
		int [] variable; 
		int variable[]; 
		int variable [];
		
		// Multiple line
		int[] ids, types; 
		int ids[], types[]; 
		int ids[], types; 	// types is not an array here
		
		// Referecen type declarations
		String [] bugs = {"cricket", "bettle", "ladybug");
		String [] alias = bugs;
		System.out.println(bugs.equals(alias));		// true
		System.out.println(bugs.toString());		// [Ljava.lang.String;@160bc7c0
		
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		againStrings[0] = new StringBuilder();	// DOES NOT Compile
		objects[0] = new StringBuilder();		// throws ArrayStoreException
		
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length);		// 3
		System.out.println(mammals[0]);			// monkey
		System.out.println(mammals[1]);			// chimp
		System.out.println(mammals[2]);			// donkey
		
		String[] birds = new String[6];
		System.out.println(birds.length);
		
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.lenght; i++)
			numbers[i] = i + 5;
	}
}