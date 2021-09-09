public class Zoo {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}

/**
In case you compile and pass the following:
javac Zoo.java
java Zoo Zoo

Program will throw the following exception:
java.lang.ArrayIndexOutOfBoundsException: 1
at Zoo.main(Zoo.java:4)

**/