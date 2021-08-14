package pond.swan;

public class ImmutableSwan {
	
	private int numberEggs;
	public ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return numberEggs;
	}
}