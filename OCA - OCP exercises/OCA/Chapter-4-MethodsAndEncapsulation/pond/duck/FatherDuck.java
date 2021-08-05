package pond.duck;

public class FatherDuck {
	
	private String noise = "quack";
	
	private void quack() {
		// private access is ok
		System.out.println(noise);
	}
	
	private void makeNoise() {
		// private access is ok
		quack();
	}
	
}