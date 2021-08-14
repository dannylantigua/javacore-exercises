import java.util.*;

public class TraditionalSearch {
	
	public static void main(String... args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbt", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, new CheckIfHopper());
		print(animals, a -> a.canHop());		// Same as line 12
		print(animals, a -> a.canSwim());
		print(animals, a -> !a.canSwim());		// Animals that cannot swim
	}
	
	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.println(animal + " ");
		}
		System.out.println()[
	}
}
		