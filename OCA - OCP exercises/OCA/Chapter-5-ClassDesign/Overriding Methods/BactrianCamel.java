public class BactrianCamel extends Camel {
	private int getNumberOfHumps () {		// Does not compile
		return 2;
	}

	// Redeclaring methods sample
	private int getNumberOfHumpsV2() {
		return 2;
	}
}