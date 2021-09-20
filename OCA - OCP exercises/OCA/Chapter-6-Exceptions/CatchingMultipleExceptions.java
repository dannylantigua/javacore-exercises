/*
Given the scenario where we have the following custom exceptions created:
class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

If they are in the same package along with the Java class to implement it, Java will recognize them.
Otherwise, an import is needed.

*/

public void visitPorcupine() {
	try {
		seeAnimal();
	} catch (AnimalsOutForAWalk e) { // first catch block
		System.out.print("try back later");
	} catch (ExhibitClosed e) { // second catch block
		System.out.print("not today");
	}
}

public void visitMonkeys() {
	try {
		seeAnimal();
	} catch (ExhibitClosedForLunch e) { // subclass exception
		System.out.print("try back later");
	} catch (ExhibitClosed e) { // superclass exception
		System.out.print("not today");
	}
}

// For classes that inherit from each other, the order of the catch clause matters.
public void visitMonkeysV2() {
	try {
		seeAnimal();
	} catch (ExhibitClosed e) { // superclass exception
		System.out.print("not today");
	} catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
		System.out.print("try back later");
	}
}

pubbbbblic void visitSnakes() {
	try {
		seeAnimal();
	} catch (RuntimeException e) {
		System.out.print("runtime exception");
	} catch (ExhibitClosed e ) { // DOES NOT COMPILE
		System.out.print("not today");
	} catch (Exception e) {
		System.out.print("exception");
	}
}
