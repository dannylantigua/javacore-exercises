public class ImportantStringBuilderMethods {
	public static void main(String... args) {
		
		// charAt(), indexOf(), length(), substring()
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		
		// append()
		// Append has many method signatures, taking different parameters
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println(sb1); // 1c-true
		
		// insert()
		sb.insert(7, "-");
		sb.insert(0, "-");
		sb.insert(4, "-");
		System.out.println(sb); // -ani-mals-
		
		// delete(), deleteCharAt()
		StringBuilder sb2 = new StringBuilder("abcdef");
		sb1.delete(1, 3); // sab1 = adef
		sb1.deleteCharAt(5); // throws exception
		
		// reverse()
		StringBuilder sb3 = new StringBuilder("ABC");
		sb3.reverse();
		System.out.println(sb3); // CBA
		
		// toString()
		String s = sb.toString();
	}
}