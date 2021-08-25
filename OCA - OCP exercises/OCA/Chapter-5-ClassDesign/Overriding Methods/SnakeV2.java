public class SnakeV2 extends ReptileV2 {
	protected double getHeight() throws Exception {		// Does not compile
		return 2;
	}
	
	protected int getLength() throws InsufficientDataException {		// Does not compile
		return 10;
	}
}