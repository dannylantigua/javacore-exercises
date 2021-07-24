public class NestedLoops {
	public static void main (String... args) {
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTTER_LOOP : for(int[] mySimpleArray : myComplexArray) {			// OUTTER_LOOP label optional
			INNER_LOOP : for(int i=0; i<mySimpleArray.length; i++) {		// INNER_LOOP label optional
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
		
		int x = 20;
		while (x>0) {
			do {
				x -= 2;
			} while (x > 5);
			X--;
			System.out.print(x+"\t");
		}
		
	}
}