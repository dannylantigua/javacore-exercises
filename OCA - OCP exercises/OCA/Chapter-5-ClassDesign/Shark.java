public class Shark extends Fish {
	private int numberOfFins = 8;
	
	public Shark(int age){
		super(age);
		this.size = 4;
	}
	
	public void displaySharkDetails() {
		System.out.print("Sahrk with age: " + getAge());
		System.out.print(" and "+ size + " meters long");
		System.out.print(" with "+ numberOfFins + " fins");
	}
	
	// Using this to refer to inner and parent members
	public void displaySharkDetails2() {
		System.out.print("Sahrk with age: " + getAge());
		System.out.print(" and "+ this.size + " meters long");
		System.out.print(" with "+ this.numberOfFins + " fins");
	}
	
	// Using super to refer to parent members
	public void displaySharkDetails2() {
		System.out.print("Sahrk with age: " + getAge());
		System.out.print(" and "+ super.size + " meters long");
		System.out.print(" with "+ this.numberOfFins + " fins");
	}
}