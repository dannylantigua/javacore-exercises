public class MultidimensionalArrays {
	public static void main(String... args) {
		
		// For declaring
		int[][] vars1;
		int vars2 [][];
		int[] vars3[];
		int[] vars4 [], space [][]; // a 2D and a 3D array
		
		// Setting the size
		// Symmetric
		String[][] rectangle = new String[3][2];
		
		// Asymmetric
		int[][] differentSize = {{1,4}, {3}, {9,8,7}};
		
		int[][] args = new int[4][];
		args[0] = new int[5];
		args[1] = new int[3];
		
		// Looping through
		int[][] twoD = new int[3][2];
		for (int i = 0; int < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		
		for(int[] inner : twoD) {
			 for(int num : inner)
				  System.out.print(num + “ “);
			 System.out.println();
		}

	}
}