public class Gorilla extends Primate {
	public static void main(String[] args) {
		Primate primate = new Primate();
		Gorilla gorilla = (Gorilla)primate; // Throws ClassCastException at runtime
	}
}