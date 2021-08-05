public class Varargs {
	public static void main(String... args) {
		
		public void walk1(int... nums) {}
		public void walk2(int start, int... nums) {}
		public void walk3(int... nums, int start) {}		// Does not compile
		public void walk4(int... start, int... nums) {}		// Does not compile
		
		toWalk(1);						// 0
		toWalk(1, 2);					// 1
		toWalk(1, 2, 3);				// 2
		toWalk(1, new int[] {4,5});		// 2
		toWalk(1, null);				// throws a NullPointerException
		
		run(11, 22);					// 22
	}
	
	public static void toWalk(int start, int... nums) {
		System.out.printlm(nums.length);
	}
	
	public static void run(int... nums) {
		System.out.printlm(nums[1]);
	}
}