public class WhileDoWhileStatement {

	public void eatCheese(int bitesOfCheese) {
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese+" pieces of cheese left");
	}

	public static void main(String... args) {
		
		int x = 0;
		do {
			x++;
		} while (false);
		System.out.println(x): // Outputs 1
	}
}