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
	// Check and return true, if Parentheses are in pair with open n close.
	static boolean isInPair(char char1, char char2)
	{
		if (char1 == '(' && char2 == ')'){
			return true;
		}
		else if (char1 == '{' && char2 == '}'){
			return true;
		}
		else if (char1 == '[' && char2 == ']'){
			return true;
		}
		else{
			return false;
		}
	}
	// Return true for balanced
	static boolean isBalancedParenthesis(char exp[])
	{

		stack stack=new stack();
		for(int i=0;i<exp.length;i++)
		{
			// Push if Open parenthesis occurs
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '['){
				stack.push(exp[i]);
			}
			// Pop if close parenthesis occurs
			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
			{
				if (stack.isEmpty())
				{
					return false;
				} 

				/* isInPair return false if parenthesis does not has close and return false */
				else if ( !isInPair(stack.pop(), exp[i]) )
				{
					return false;
				}
			}

		}

		//If stack empty then its balanced 
		if (stack.isEmpty()){
			return true;
		}
		else
		{   //For unbalanced 
			return false;
		} 
	} 
	public static void main(String[] args) 
    {
        char paranExp[] = {'(','{',')','}'};
          if (isBalancedParenthesis(paranExp)){
            System.out.println("Balanced");
          }
          else{
            System.out.println("Unbalanced");  
          }
    }
}