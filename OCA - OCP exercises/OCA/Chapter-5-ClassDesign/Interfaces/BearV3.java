public class BearV3 implements HerbivoreV3, Omnivore {	// Does not compile
	public void eatMeat() {
		System.out.println("Eating meat");
	}
	
	public int eatPlants() {		// Does not compile
		System.out.println("Eating plants: 10");
		return 10;
	}
	
	public void eatPlants() {		// Does not compile
		System.out.println("Eating plants");
	}
}