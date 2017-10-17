package com.data.structure.stack;

class Stack
{
	static final int MAX_SIZE = 100;
	int top;
	int a[] = new int[MAX_SIZE];

	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}

	boolean push(int x)
	{
		if (top >= MAX_SIZE)
		{
			System.out.println("Stack Overflow Occurs");
			return false;
		}
		else
		{
			a[++top] = x;
			return true;
		}
	}

	int pop()
	{
		if (top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x = a[top--];
			return x;
		}
	}
}

class Driver
{
	public static void main(String args[])
	{
		Stack stack = new Stack();
		stack.push(34);
		stack.push(12);
		stack.push(9);
		stack.push(98);
		stack.push(89);
		System.out.println(stack.pop() + "< Popped from stack");
	}
}
