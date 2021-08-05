package pond.duck;

public class MotherDuck {
	
	String noise = "quack";
	
	void quack () {
		// default access is ok
		System.out.println(noise);
	}
	
	private voide makeNoise() {
		// default access is ok
		quack();
	}
	
}