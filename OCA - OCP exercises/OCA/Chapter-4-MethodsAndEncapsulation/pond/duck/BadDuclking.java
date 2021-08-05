package pond.duck;

public class BadDuclking {
	
	public void makeNoise() {
		FatherDuck duck = new FatherDuck();
		duck.quack();						// Does not compile
		System.out.println(duck.noise);		// Does not compile
	}
	
}