package pond.inland;
import pond.shore.Bird;

public class BirdWatcherFromAfar {
	
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater();				// Does not compile
		System.out.println(bird.text);		// Does not compile
	}
}