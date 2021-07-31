public class JavaArraySortingAndSearching {
	public static void main(String... args) {
		
		// Numeric sorting
		int[] numbers = { 6, 9 , 1 };
		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		// String sorting
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");		// 10, 100, 9
		// 1 comes before 9
		// Uppercase gets sorted before lowercase values
		
		// Searching
		int[] numbers2 = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers2, 2));		// 0
		System.out.println(Arrays.binarySearch(numbers2, 4));		// 1
		System.out.println(Arrays.binarySearch(numbers2, 1));		// -1
		System.out.println(Arrays.binarySearch(numbers2, 3));		// -2
		System.out.println(Arrays.binarySearch(numbers2, 9));		// -5
		
		int[] numbers3 = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numbers3, 2));
		System.out.println(Arrays.binarySearch(numbers3, 3));
		
	}
}