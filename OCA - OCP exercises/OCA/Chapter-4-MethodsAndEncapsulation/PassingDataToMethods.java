public class PassingDataToMethods {
	
	public static void main(String... args) {
		
		// Primitive type
		int num = 4;
		newNumber(num);
		System.out.println(num);	// 4
		
		// Reference type
		String name = "Webby";
		speak(name);
		System.out.println(name);	// Webby
		
		StringBuilder name2 = new StringBuilder();
		speak(name2);
		System.out.println(name2);	// Webby
		
		// Returning values
		int number = 1;
		String letters = "abc";
		number(number);								// 1
		letters = letters(letters);					// abcd
		System.out.println(number + letters);		// 1abcd
	}
	
	public static void newNumber(int num) {
		num = 8;
	}
	
	public static void speak(String name) {
		name = "Sparky";
	}
	
	public static void speak(StringBuilder s) {
		// s is a copy of the variable being passed in main, but
		// both point to the same object
		// and Webby gets appended as we call a method,
		// we are not doing a direct assginment.
		s.append("Webby");
	}
	
	// Returning values
	public static int number(int number) {
		number++;
		return number;
	}
	
	public static String letters(String letters) {
		letters+= "d";
		return letters;
	}
	
}
