package com.data.structure.stack;

import java.util.Stack;


/*Auxiliarry stack */
 
class SpecialStack extends Stack<Integer>
{
    Stack<Integer> min = new Stack<>();
    void push(int x)
    {
        if(isEmpty() == true)
        {
            super.push(x);
            min.push(x);
        }
        else
        {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if(x < y)
                min.push(x);
            else
                min.push(y);
        }
    }
 
//Pop Operations
    public Integer pop()
    {
        int x = super.pop();
        min.pop();
        return x;
    }
 
    int fatchMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }
 
    /* Main */
    public static void main(String[] args) 
    {
        SpecialStack s = new SpecialStack();
        s.push(20);
        s.push(40);
        s.push(60);
        System.out.println(s.fatchMin());
        s.push(80);
        System.out.println(s.fatchMin());
    }
    
}