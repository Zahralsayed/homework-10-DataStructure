package com.ga.Ex3;

import java.util.Stack;

public class ReverseStack {

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        toBottom(stack, top);
    }

    private static void toBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        toBottom(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        System.out.println("Original Stack: " + stack1);
        reverse(stack1);
        System.out.println("Reversed Stack: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(10);
        stack2.push(20);

        System.out.println("\nOriginal Stack: " + stack2);
        reverse(stack2);
        System.out.println("Reversed Stack: " + stack2);

        Stack<Integer> stack3 = new Stack<>();
        System.out.println("\nOriginal Stack: " + stack3);
        reverse(stack3);
        System.out.println("Reversed Stack: " + stack3);
    }
}


/*

Challenges: What challenges did you encounter during the implementation?
 -  reversing the stack with only stack operation (push and pop) - no additional data structure


Efficiency: How efficient is your solution? Could there be a more optimal approach?
- time complexity of O(n²), more optimal approach achieved by using additional stack

Applications: Consider how the stack data structure can be applied in other programming problems. Discuss any ideas or insights.
The stack data structure is widely used in many programming problems where Last-In-First-Out (LIFO) behavior is required.

Common applications:
- checking balanced parentheses
- undo and redo operation
- backtracking algorithm

 */