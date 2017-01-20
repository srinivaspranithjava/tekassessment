package com.simple.calculator.service;

import java.util.Stack;

import com.simple.calculator.util.Util;

public class Calculator {

	public Double doCalculation(String expression) {
		char[] elements = expression.toCharArray();

		Stack<Character> operands = new Stack<Character>();
		Stack<Double> values = new Stack<Double>();

		for (int pointer = 0; pointer < elements.length; pointer++) {

		//	System.out.println(elements[pointer]);

			if (elements[pointer] == ' ')
				continue;

			if (Util.isNumber(elements[pointer])) {

				String str = "";
				while (pointer < elements.length && Util.isNumber(elements[pointer]))
					str += elements[pointer++];
				values.push(Double.parseDouble(str));
			}
			if ( pointer < elements.length && Util.isOperand(elements[pointer])) {

				while (!operands.empty() && Util.isHighOrder(elements[pointer], operands.peek())) {
					Double result = Util.calculate(operands.pop(), values.pop(), values.pop());
					values.push(result);
				}
				operands.push(elements[pointer]);

			}

		}

		while (!operands.empty()) {
			Double result = Util.calculate(operands.pop(), values.pop(), values.pop());
			values.push(result);
		}

		return values.pop();
	}

}
