public class ImportantStringMethods {
	public static void main(String... args) {
		String string = "animals";
		
		// length()
		System.out.println(string.length());  // 7
		
		// charAt()
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(6));
		System.out.println(string.charAt(7)); // throws Exception
		
		// indexOf()
		System.out.println(string.indexOf('a')); 	// 0
		System.out.println(string.indexOf('al'));	// 4
		System.out.println(string.indexOf('a', 4));	// 4
		System.out.println(string.indexOf('al', 5));// -1
		
		// substring()
		System.out.println(string.substring(3)); 					// mals
		System.out.println(string.substring(string.indexOf('m')));	// mals
		System.out.println(string.substring(3, 4));					// m
		System.out.println(string.substring(3, 7));					// mals
		System.out.println(string.substring(3, 3));					// empty string
		System.out.println(string.substring(3, 2));					// throws exception
		System.out.println(string.substring(3, 8));					// throws exception
		
		// toLowerCase(0 and toUpperCase()
		System.out.println(string.toUpperCase());		// ANIMALS
		System.out.println("Abc123".toLowerCase());		// abc123
		
		// equals() and equalsIgnoreCase()
		
	}
}