public class WrapperClasses {
	public static void main(String... args) {
		
		// parse from String to Wrapper and viceversa
		int primitive = Integer.parseInt("123");	// String to int
		Integer wrapper = Integer.valueOf("123");	// String to Integer Wrapper
		
		int bad1 = Integer.parseInt("a");	// throws NumberFormatException
		Integer bad2 = Integer.valueOf("123.45");	// throws NumberFormatException
		
		// Autoboxing
		List<Double> weights = new ArrayList<>();
		// Autoboxes 50.5 to Double weapper, then passes it to the List:
		weights.add(50.5);		
		// Explicit way:
		weights.add(new Double(60));
		// Autoboxes 50.5 to Double wrapper, then passes it to remove():
		weights.remove(50.5);
		// Unboxes Double wrapper to primitive
		double first = weights.get(0);
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0);		// NullPointerException
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);			// removes number in position 1
		System.out.println(numbers);
		
		// Convert from ArrayList to Array
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);		// 2
		// With size 0, java will create the proper size:
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length);		// 2
		
		// Convert from Array to ArrayList
		String[] array = {"hawk", "robin"};
		List<String> list = Arrays.asList(array);	// returns fixed size
		System.out.println(list.size());			// 2
		list.set(1, "test");						// [hawk, test]
		array[0] = "new";							// [new, test]
		for (String b : array)
			System.out.print(b + " ");				// new test
		list.remove(1);								// throws UnsupportedOperationException
		
		// Converting to List using varargs
		List<String> myList = Arrays.asList("one", "two");
		
		// Sorting
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(99);
		numbers2.add(5);
		numbers2.add(81);
		Collections.sort(numbers2);
		System.out.println(numbers);	// 5, 81, 99
		
	}
}
