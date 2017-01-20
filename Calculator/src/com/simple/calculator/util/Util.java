package com.simple.calculator.util;

import com.simple.calculator.service.OperationsManager;

public class Util {

	public static boolean isHighOrder(char op1, char op2) {

		
		boolean isHighOrder = false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			isHighOrder = false;
		else
			isHighOrder = true;
		return isHighOrder;
	}

	public static double calculate(char operand, double number2, double number1) {
		return OperationsManager.doOperation(operand).doOperation(number1, number2);
	}

	public static boolean isOperand(char operand) {

		if (operand == '+' || operand == '-' || operand == '*' || operand == '/') {
			return true;
		}
		return false;
	}
	
	public static boolean isNumber(char element){
		
		if (element >= '0' && element <= '9') {
			return true;
		}
		return false;
		
	}

}
