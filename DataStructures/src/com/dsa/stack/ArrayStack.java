package com.dsa.stack;

public class ArrayStack {
	static final int MAX = 1000;
	int top;
	int[] stack = new int[MAX];
	
	ArrayStack() {
		top = -1;
	}
	
	public boolean isEmpty() {
		if(top<0) {
			return true;
		}
		return false;
	}
	
	public void push(int data) {
		if(top==MAX-1) {
			System.out.println("Stack is full!");
			return;
		}
		stack[++top] = data;
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("Stack is empty!");
			return -1;
		}
		return stack[top--];
	}
	
	public int seek() {
		if(top<0) {
			System.out.println("Stack is empty!");
			return -1;
		}
		return stack[top];
	}
	
	public void printStack() {
		if(top<0) {
			System.out.println("Stack is empty!");
			return;
		}
		int temp = top;
		while(temp>=0) {
			System.out.println(stack[temp] + " ");
			temp--;
		}
		System.out.println();
	}

}
