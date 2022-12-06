package com.ll2;
 class SinglyLinkedList {
    private ListNode head;

    private  class ListNode {
         int data;
         ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //------display all list-------
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }
        System.out.println();
    }
    //-----insert node at begining------
     public void insertFirst(int value) {
         ListNode newNode = new ListNode(value);
         newNode.next = head;
         head = newNode;
     }
     //----insert at list-----
     public void insertLast(int value) {
         ListNode newNode = new ListNode(value);
         if (head == null) {
             head = newNode;
             return;
         }
         ListNode current = head;
         while (null != current.next) {
             current = current.next;
         }
         current.next = newNode;
     }

     //---delete first node------
     public ListNode deleteFirst() {
         if(head == null) {
             return null;
         }
         ListNode temp = head;
         head = head.next;
         temp.next = null;
         return temp;
     }

     //---delete the node at some position---
     public void delete(int position){
         // position is valid and starting from 1
         // 3 -> 4 -> 7 -> 8 -> 9 -> null
         if(position == 1){
             head = head.next;
         } else {
             ListNode temp = head;
             int count = 1;
             while(count < position - 1){
                 temp = temp.next;
                 count++;
             }

             ListNode current = temp.next;
             temp.next = current.next;
             current=null;
         }
     }

     //---delete last node--
     public ListNode deleteLast() {
         if(head == null) {
             return head;
         }
         if(head.next == null) {
             ListNode temp = head;
             head = head.next;
             return temp;
         }
      // p followed by q
         ListNode p = head;
         ListNode q = null;

         while(p.next != null) {
             q = p;
             p = p.next;
         }
         q.next = null; // break the chain
         return p;
     }

     //-----is value is there in the LL ?
     public boolean find(int searchKey) {
         if(head == null) {
             return false;
         }
         ListNode p = head;
         while(p != null) {
             if(p.data == searchKey) {
                 return true;
             }
             p = p.next;
         }
         return false;
     }

    //----get middle of LL ---------?
     public ListNode getMiddleNode() {
         if(head == null) {
             return null;
         }
         ListNode slowPtr = head;
         ListNode fastPtr = head;

         while(fastPtr != null && fastPtr.next != null) {
             slowPtr = slowPtr.next;
             fastPtr = fastPtr.next.next;
         }
         return slowPtr;
     }

     //-------insert value in sorted list---------
     public ListNode insertInSortedList(int value) {
         ListNode newNode = new ListNode(value);
         if(head == null) {
             return newNode;
         }
         ListNode current = head;
         ListNode temp = null;
         while (current != null && current.data < newNode.data) {
             temp = current;
             current = current.next;
         }
         newNode.next = current;
         temp.next = newNode;
         return head;
     }
    //------delete node for an given key-------
    public void deleteNode(int key) {
        ListNode p = head;//p is followed by q
        ListNode q = null;
        //if we find data in the first not itself
        if(p != null && p.data == key){
            head = p.next;
            return;
        }
        while(p != null && p.data != key){
            q = p;
            p = p.next;
        }
        if(p == null){
            return;
        }
        q.next = p.next;
    }

     public  ListNode merge(ListNode a, ListNode b){
         // a --> 1 --> 3 --> 5 --> null
         // b --> 2 --> 4 --> 6 --> null
         // result --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
         ListNode dummy = new ListNode(0);
         ListNode tail = dummy;
         while(a != null && b != null){
             if(a.data <= b.data){
                 tail.next = a;
                 a = a.next;
             } else {
                 tail.next = b;
                 b = b.next;
             }
             tail = tail.next;
         }

         // a --> 1 --> 3 --> null
         // b --> 2 --> 4 --> 6 --> 7 --> 9 --> 10 --> null
         // result --> 1 --> 2 --> 3 --> 4 --> 6 --> 7 --> 9 --> 10 --> null

         if(a == null){
             tail.next = b;
         } else {
             tail.next = a;
         }

         return dummy.next;
     }
 }
public class DemoLL {
    public static void main(String[] args) {

        SinglyLinkedList ll=new SinglyLinkedList();
        ll.insertFirst(44);
        ll.insertFirst(4);
        ll.insertFirst(440);


        ll.insertLast(666);

       // ll.deleteFirst();
        ll.display();
        ll.delete(3);
        ll.display();

    }
}
