package com.ll2;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private class Node {
		 int data;
		 Node left;
		 Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	public DoublyLinkedList() {
		this.head =this.tail = null;
	}
	public void insertFirst(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			tail = newNode;
		} else {
			head.left = newNode;
		}
		newNode.left = head;
		head = newNode;
	}

	public void displayForward() {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.right;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.insertFirst(3);
		dll.insertFirst(44);
		dll.insertFirst(3);
		dll.insertFirst(44);
		dll.displayForward();
	}
}