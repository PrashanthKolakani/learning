package com.dsa.linkedlist;

public class SinglyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
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

	public void insertAfter(int key, int new_data) {
		Node temp = head;
		while (temp != null && temp.data != key) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Given key " + key + " does not exist in the Linked List");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = temp.next;
		temp.next = new_node;
	}

	public void insertAt(int position, int new_data) {
		if (position < 0) {
			System.out.println("Invalid Position! : " + position);
			return;
		}
		if (position == 0 && head != null) {
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
		Node temp = head;
		int current_position = 0;
		while (temp != null && current_position != position - 1) {
			temp = temp.next;
			current_position++;
		}
		if (temp == null) {
			System.out.println("Given position " + position + " does not exist in the Linked List");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = temp.next;
		temp.next = new_node;
	}

	public void append(int new_data) {
		Node temp = head;
		if (temp == null) {
			System.out.println("Linked List is empty!");
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		Node new_node = new Node(new_data);
		temp.next = new_node;
	}

	public void deleteKey(int key) {
		if (head != null && head.data == key) {
			head = head.next;
			return;
		}
		Node current = head;
		Node prev = null;
		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		if (current == null) {
			System.out.println("Given key " + key + " does not exist in the Linked List");
			return;
		}
		prev.next = current.next;
	}

	public void deleteAt(int position) {
		if (position < 0) {
			System.out.println("Invalid position! : " + position);
			return;
		}
		if (position == 0 && head != null) {
			head = head.next;
			return;
		}
		Node current = head;
		Node prev = null;
		int current_position = 0;
		while (current != null && current_position != position) {
			prev = current;
			current = current.next;
			current_position++;
		}
		if (current == null) {
			System.out.println("Given position " + position + " does not exist in the Linked List");
			return;
		}
		prev.next = current.next;
	}

	public int length() {
		if (head == null) {
			System.out.println("Linked List is empty!");
			return 0;
		}
		Node temp = head;
		int length = 0;
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}

	public int search(int key) {
		if (head == null) {
			System.out.println("Linked List is empty!");
			return -1;
		}
		Node temp = head;
		int position = 0;
		while (temp != null && temp.data != key) {
			temp = temp.next;
			position++;
		}
		if (temp == null) {
			System.out.println("Given key " + key + " does not exist in the Linked List");
			return -1;
		}
		return position;

	}

	public void printList() {
		if (head == null) {
			System.out.println("Linked List is empty!");
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
