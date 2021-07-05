public interface CanSwim {}
public class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
public class FindAllTadPole {
	public static void main (String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for (Amphibian amphibian : tadpoles) {
			_________ tadpole = amphibian;
		}
	}
}

// What statements can be used in the blank?