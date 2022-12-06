package com.ll;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;

	private class ListNode {
		 int data; // Can be any generic type
		 ListNode right;
		 ListNode left;
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = this.tail = null;
	}
	

	
	public void displayForward() {
		if(head == null) {
			return;
		}
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.right;
		}
	}
	
	public void displayBackward() {
		if(head == null) {
			return;
		}
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.left;
		}
		System.out.println("null");
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			tail = newNode;
		} else {
			head.left = newNode;
		}
		newNode.right = head;
		head = newNode;
	}

	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			head = newNode;
		} else {
			tail.right = newNode;
			newNode.left = tail;
		}
		tail = newNode;
	}

	public ListNode deleteFirst() {
		if(head==null) {
			throw new NoSuchElementException();
		}

		ListNode temp = head;
		if(head == tail) {
			tail = null;
		} else {
			head.right.left = null;
		}
		head = head.right;
		temp.right = null;
		return temp;
	}

	public ListNode deleteLast() {
		if(head==null) {
			throw new NoSuchElementException();
		}

		ListNode temp = tail;
		if(head == tail) {
			head = null;
		} else {
			tail.left.right = null;
		}
		tail = tail.left;
		temp.left = null;
		return temp;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertEnd(1);
		dll.insertEnd(2);
		dll.insertEnd(3);

	//	dll.displayForward();

	//	dll.deleteLast();
		dll.deleteFirst();
//
		dll.displayForward();
	}
}