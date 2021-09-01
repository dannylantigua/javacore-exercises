public interface CanFly {
	void fly (int speed);
	abstract void takeoff();
	public abstract double dive();
}

/*
This is equivalent, as the compiles inserts "abstract" keyword for you

public abstract interface CanFly {
	public abstract void fly (int speed);
	public abstract void takeoff();
	public abstract double dive();
}

*/