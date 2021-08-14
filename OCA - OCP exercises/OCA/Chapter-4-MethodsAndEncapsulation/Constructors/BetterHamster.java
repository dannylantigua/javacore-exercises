public class BetterHamster {
	
	private String color;
	private int weight;
	
	public Hamster(int weight) {
		this(weight, "brown");
	}
	
	public Hamster (int weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	
	public Hamster(String color) {
		System.out.println("in constructor");
		// ready to call this
		this(2, color);			// Does not compile
	}
}