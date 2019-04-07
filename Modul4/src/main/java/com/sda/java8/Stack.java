package com.sda.java8;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] stack = new int[MAX_SIZE];
    private int top = -1;

    void push(int val) {
        if (top == MAX_SIZE - 1) {
            return;
        }
        top++;
        stack[top] = val;


    }

    int pop()  {
        if (top < 0){
            System.out.println("No element lift" );
        }
        int val = stack[top];
        top = top -1;
        return val;

        //return


    }
}