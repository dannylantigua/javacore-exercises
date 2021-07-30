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
		
	}
}