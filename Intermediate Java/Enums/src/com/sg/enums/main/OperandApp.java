package com.sg.enums.main;

import java.util.Scanner;

public class OperandApp {

	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0, operand1, operand2;
		IntMath calcular = new IntMath();

		option = getOption(option);
		System.out.println("Operand1: ");
		operand1 = scnr.nextInt();
		System.out.println("Operand2: ");
		operand2 = scnr.nextInt();

		System.out.println(calcular.calculate(getEnum(option), operand1, operand2));
	}

	private static int getOption(int option) {
		System.out.println("Choose Operand:");
		System.out.println("1. ADD");
		System.out.println("2. SUBSTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");

		while (option < 1 || option > 4)
			option = scnr.nextInt();
		return option;
	}

	private static Operators getEnum (int option) {
		if (option == 1)
			return Operators.PLUS;
		else if (option == 2)
			return Operators.MINUS;
		else if (option == 3)
			return Operators.MULTIPLY;
		else if (option == 4)
			return Operators.DIVIDE;
		else
			return null;
	}
}
