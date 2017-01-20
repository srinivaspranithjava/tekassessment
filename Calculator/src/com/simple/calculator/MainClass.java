package com.simple.calculator;

import com.simple.calculator.service.Calculator;

public class MainClass {

	
 
    public static void main(String[] args)
    {
    	
    	if(args.length == 0)
        {
            System.out.println("pass express as command line argument");
            return;
        }
    	Calculator calculator = new Calculator();

    	String expression = args[0];
    	
        System.out.println(calculator.doCalculation(expression));
    
    }
}
