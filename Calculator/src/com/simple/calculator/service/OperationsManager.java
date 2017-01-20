package com.simple.calculator.service;

import com.simple.calculator.operations.AddOperation;
import com.simple.calculator.operations.DivideOperation;
import com.simple.calculator.operations.MultiplyOperation;
import com.simple.calculator.operations.Operation;
import com.simple.calculator.operations.SubtractOperation;

public class OperationsManager {

	public static Operation doOperation(char operand) {

		switch (operand) {
		case '*':
			return new MultiplyOperation();
		case '/':
			return new DivideOperation();
		case '+':
			return new AddOperation();
		case '-':
			return new SubtractOperation();

		}
		return new MultiplyOperation();
	}
}
