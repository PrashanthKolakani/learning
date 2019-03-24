package com.dsa.stack;

public class LinkedListStackTest {

	public static void mainTest(String[] args) {

		LinkedListStack linkedListStack = new LinkedListStack();

		System.out.println(linkedListStack.isEmpty());

		linkedListStack.push(1);
		linkedListStack.push(2);
		linkedListStack.push(3);
		linkedListStack.push(4);
		linkedListStack.push(5);
		linkedListStack.printStack();

		System.out.println(linkedListStack.pop() + "\n");
		linkedListStack.printStack();

		System.out.println(linkedListStack.seek() + "\n");
		linkedListStack.printStack();

	}

}
