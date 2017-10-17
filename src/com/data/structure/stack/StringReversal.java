package com.data.structure.stack;

/* Java program to String reversal using Stack */

class Stacks
{
	int size;
	int top;
	char[] a; 

	//Empty Check
	boolean isEmpty()
	{
		return (top < 0);
	}

	Stacks(int n)
	{
		top = -1;
		size = n;
		a = new char[size];
	}

	//Push
	boolean push(char x)
	{
		if (top >= size)
		{
			System.out.println("Stack Overflow!");
			return false;
		}
		else
		{
			a[++top] = x;
			return true;
		}
	}

	//Pop
	char pop()
	{
		if (top < 0)
		{
			System.out.println("Stack Underflow!");
			return 0;
		}
		else
		{
			char x = a[top--];
			return x;
		}
	}
}
class StringReversal
{
 public static void reverse(StringBuffer str)
 {
     int n = str.length();
     Stacks obj = new Stacks(n);  
     // Push all characters of string 
     int i;
     for (i = 0; i < n; i++)
        obj.push(str.charAt(i));   
     // Pop all characters of string 
     for (i = 0; i < n; i++)
        { 
          char ch = obj.pop();
          str.setCharAt(i,ch);
        }
 } 
}

