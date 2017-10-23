package com.data.structure.stack;

//Java program for checking Balanced Parentheses
public class BalancedParentheses 
{
	static class stack 
	{
		int top=-1;
		char items[] = new char[50];

		void push(char x) 
		{
			if (top == 49) 
			{
				System.out.println("Stack Overflow");
			} 
			else
			{
				items[++top] = x;
			}
		}
		char pop() 
		{
			if (top == -1) 
			{
				System.out.println("Error");
				return '\0';
			} 
			else
			{
				char element = items[top];
				top--;
				return element;
			}
		}
		//Return true if Stack Empty 
		boolean isEmpty() 
		{
			return (top == -1) ? true : false;
		}
	}

}