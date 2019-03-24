package com.dsa.linkedlist;

public class CircularLinkedListTest {

	public static void mainTest(String[] args) {
		CircularLinkedList linked_list = new CircularLinkedList();

		linked_list.push(1);
		linked_list.printList();

		linked_list.append(2);
		linked_list.printList();

		linked_list.insertAfter(2, 3);
		linked_list.printList();

		linked_list.insertAt(2, 4);
		linked_list.printList();

		linked_list.deleteKey(4);
		linked_list.printList();

		linked_list.deleteAt(1);
		linked_list.printList();

		System.out.println("Linked List length : " + linked_list.length());

		System.out.println("Position of 3 : " + linked_list.search(3));

	}

}
