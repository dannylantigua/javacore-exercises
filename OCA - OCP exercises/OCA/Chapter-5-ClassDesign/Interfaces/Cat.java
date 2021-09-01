public class Cat implements Walk, Run {
	// If override method is not present, it will not compile
	public default int getSpeed() {
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}