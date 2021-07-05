public static void main(String[] args) {
	// INSERT CODE HERE
}
private static boolean test(Predicate<Integer> p) {
	return p.test(5);
}

/* What line of code can be inserted?

a. System.out.println(test(i -> i == 5));
b. System.out.println(test(i -> {i == 5;}));
c. System.out.println(test((i) -> i == 5));
d. System.out.println(test((int i) -> i == 5));
e. System.out.println(test(int i) -> {return i == 5;}));
f. System.out.println(test((i) -> {return i == 5;}));

*/