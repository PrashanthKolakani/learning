package com.dsa.stack;

public class ArrayStackTest {

	public static void mainTest(String[] args) {
		
		ArrayStack arrayStack = new ArrayStack();
		
		System.out.println(arrayStack.isEmpty());
		
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(5);
		arrayStack.printStack();
		
		System.out.println(arrayStack.pop() + "\n");
		arrayStack.printStack();
		
		System.out.println(arrayStack.seek() + "\n");
		arrayStack.printStack();

	}

}
