package org.example;
import java.util.Stack;

public class Stack_implementation {

    public static void main(String[] args) {
        System.out.println("This is the program for Stack Implementation");
        Stack<String> stack = new Stack<>();
        stack.push("lion");
        stack.push("tiger");
        stack.push("horse");
        stack.push("dog");
        stack.push("cat");
        stack.push("mouse");
        System.out.println(stack);

//        Printing top element
        String top = stack.peek();
        System.out.println(top);

//        Popping the element from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        stack.pop();
        stack.pop();
//        stack.pop();
        System.out.println(stack);

    }
}
