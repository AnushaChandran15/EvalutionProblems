package com.anushachandran1502.evalutionProblems;

import java.util.Scanner;
import java.util.Stack;

public class Question7 {
	public static void main(String[] args) {
		Question7 question7=new Question7();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a expression");
		String expression=scanner.nextLine();
		int result=question7.EvaluatePOstfixExpression(expression);
		System.out.println(result);
	}

	private int EvaluatePOstfixExpression(String exp) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<exp.length();i++)
		{
			if(Character.isDigit(exp.charAt(i)))
			{
			stack.push(exp.charAt(i)-48);
			}
			else
			{
				char operator=exp.charAt(i);
				int num2=stack.pop();
				int num1=stack.pop();
				int result=arthmeticOperation(operator,num1,num2);
				stack.push(result);
			}
			
		}
		return stack.pop();
	}

	private int arthmeticOperation(char operator, int num1, int num2) {
		// TODO Auto-generated methodtub
		switch(operator)
		{
		case '+':
				return num1+num2;
		case '-':
				return num1-num2;
		case '*':
				return num1*num2;
		case '/':
				return num1/num2;		
		}
		return 0;
	}

}
