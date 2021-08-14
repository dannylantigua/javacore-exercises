public class NotImmutable {
	private StringBuilder builder;
	
	// This allows builder to be modified.
	public NotImmutable (StringBuilder b) {
		builder = b;
	}
	
	// This allows to get builder by reference and be modified
	public StringBuilder getBuilder() {
		return builder;
	}
	
	// Solution 1
	public StringBuilder getBuilder2() {
		return new StringBuilder(builder);
	}
	
	// Solution 2
	public StringBuilder getBuilder3() {
		return builder.toString();		// Strings are immutable
	}
	
	public static void main (String... args) {
		StringBuilder sb = new StringBuilder("initial");
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(problem.getBuilder);				// "initial added more"
	}
}