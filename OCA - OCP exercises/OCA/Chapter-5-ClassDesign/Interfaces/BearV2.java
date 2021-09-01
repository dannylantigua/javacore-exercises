public class BearV2 implements HerbivoreV2, Omnivore {
	public void eatMeat() {
		System.out.println("Eating meat");
	}
	
	public int eatPlants(int quantity) {
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}
	
	public void eatPlants() {
		System.out.println("Eating plants");
	}
}