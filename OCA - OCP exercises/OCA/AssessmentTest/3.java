interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
	protected int getTailLength() { retunr 4; }
}
public class Cougar extends Puma {
	public static void main (Stirng[] args) {
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
	}
	public int getTailLength(int length) { return 2; }
}

// The code will not compile because of lines: