package com.dsa.stack;

import java.util.Iterator;
import java.util.Stack;

public class JavaStack {

	public static void mainTest(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		printStack(stack);
		
		System.out.println(stack.pop() + "\n");
		printStack(stack);
		
		System.out.println(stack.peek() + "\n");
		printStack(stack);
		
		System.out.println(stack.search(3));
	}

	private static void printStack(Stack<Integer> stack) {
		Iterator<Integer> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}

}
