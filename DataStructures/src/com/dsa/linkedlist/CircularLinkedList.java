package com.dsa.linkedlist;

import com.dsa.linkedlist.SinglyLinkedList.Node;

public class CircularLinkedList {
	Node head;
	Node tail;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			new_node.next = new_node;
			head = new_node;
			tail = new_node;
			return;
		}

		new_node.next = head;
		head = new_node;
		tail.next = new_node;
	}

	public void insertAfter(int key, int new_data) {
		if (tail!=null && tail.data == key) {
			Node new_node = new Node(new_data);
			new_node.next = head;
			tail.next = new_node;
			tail = new_node;
			return;
		}
		Node temp = head;
		while (temp != tail && temp.data != key) {
			temp = temp.next;
		}
		if (temp == tail) {
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
			tail.next = new_node;
		}
		Node temp = head;
		int current_position = 0;
		while (temp != tail && current_position != position - 1) {
			temp = temp.next;
			current_position++;
		}
		if (temp == tail) {
			System.out.println("Given position " + position + " does not exist in the Linked List");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = temp.next;
		temp.next = new_node;
	}

	public void append(int new_data) {
		if (head == null) {
			System.out.println("Linked List is empty!");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = head;
		tail.next = new_node;
		tail = new_node;
	}

	public void deleteKey(int key) {
		if (head != null && head.data == key) {
			head = head.next;
			tail.next = head;
			return;
		}
		Node current = head;
		Node prev = null;
		while (current != tail && current.data != key) {
			prev = current;
			current = current.next;
		}
		if (current == tail) {
			if (current.data == key) {
				prev.next = head;
				prev = tail;
				return;
			} else {
				System.out.println("Given key " + key + " does not exist in the Linked List");
				return;
			}
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
			tail.next = head;
			return;
		}
		Node current = head;
		Node prev = null;
		int current_position = 0;
		while (current != tail && current_position != position) {
			prev = current;
			current = current.next;
			current_position++;
		}
		if (current == tail) {
			if(current_position == position) {
				prev.next = head;
				prev = tail;
				return;
			}else {
				System.out.println("Given position " + position + " does not exist in the Linked List");
				return;
			}
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
		while (temp != tail) {
			temp = temp.next;
			length++;
		}
		return ++length;
	}

	public int search(int key) {
		if (head == null) {
			System.out.println("Linked List is empty!");
			return -1;
		}
		Node temp = head;
		int position = 0;
		while (temp != tail && temp.data != key) {
			temp = temp.next;
			position++;
		}
		if (temp == tail) {
			if(temp.data == key) {
				return position;
			}else {
				System.out.println("Given key " + key + " does not exist in the Linked List");
				return -1;
			}
		}
		return position;
	}

	public void printList() {
		if (head == null) {
			System.out.println("Linked List is empty!");
			return;
		}
		Node temp = head;
		while (temp != tail) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data + "\n");
	}
}
