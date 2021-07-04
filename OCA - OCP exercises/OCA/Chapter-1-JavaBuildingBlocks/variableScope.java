// do not compile this java file
// samples of variables going out of scope

// one
public void eatIfHungry(boolean hungry) {
	if (hungry) {
		int bitesOfCheese = 1;
		{
			boolean teenyBit = true;
			System.out.prinln(bitesOfCheese);
		}
	}
	System.out.println(teenyBit); // DOES NOT COMPILE
}

// Shortest scope: teenyBit
// Second shortest: bitesOfCheese
// Largest scope: hungry

// two
public void eatMore(boolean hungry, int amountOfFood) {
	int roomInBelly = 5;
	if (hungry) {
		boolean timeToEat = true;
		while (amountOfFood > 0) {
			int amountEaten = 2;
			roomInBelly = roomInBelly - amounEaten;
			amountOfFood - amountOfFood - amountEaten;
		}
	}
	System.out.println(amountOfFood);
}

/* Shortest scope: amountEaten
* Second shortest: timeToEat
* Third shortest: roomInBelly
* Largest scope: hungry and amountOfFood
*/

// three
public class Mouse {
	static int MAX_LENGHT = 5;
	int length;
	
	public void grow(int inches) {
		if (length < MAX_LENGHT) {
			int newSize = length + inches;
			length = newSize;
		}
	}
}

// Shortest scope: inches (local variable)
// Second shortest: length (local variable)
// Largest scope: MAX_LENGTH (class variable)
