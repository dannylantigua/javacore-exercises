package com.sg.enums.main;

public class IntMath {

	public int calculate(Operators op, int operand1, int operand2) {
		switch (op) {
		case PLUS:
			return operand1 + operand2;
		case MINUS:
			return operand1 - operand2;
		case MULTIPLY:
			return operand1 * operand2;
		case DIVIDE:
			return operand1 / operand2;
		default:
			throw new UnsupportedOperationException();
		}
	}
}
