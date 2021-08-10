package pond.swan;
import pond.shore.Bird;

public class Swan extends Bird {
	
	public void Swim() {
		floatInWater();					// package access to supperclass
		System.out.println(text);		// package access to supperclass
	}
	
	public void helpOtherSwanSwim() {
		Swan other new Swan();
		other.floatInWater();				// package access to supperclass
		System.out.println(other.text);		// package access to supperclass
	}
	
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater();				// Does not compile
		System.out.println(other.text);		// Does not compile
	}
}
