package com.dsa.stack;

public class LinkedListStack {
	Node head;

	class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("Stack is empty!");
			return -1;
		}
		int temp = head.data;
		head = head.next;
		return temp;
	}
	
	public int seek() {
		if(head==null) {
			System.out.println("Stack is empty!");
			return -1;
		}
		return head.data;
	}
	
	public void printStack() {
		if (head == null) {
			System.out.println("Stack is empty!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
