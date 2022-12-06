package com.ll2;
class CircularLL{
    private Node list;
    private  class Node {
        int data;
         Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void insert(int data){
        Node temp=new Node(data);
        if(list==null){
            list=temp;
        }else
            temp.next=list.next;
        list.next=temp;
    }
    public void print(){
      Node temp=list.next;
       for(; temp!=list; temp=temp.next){
           System.out.print(temp.data+"->");
       }
    }
}

public class DemoCLL {
    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.insert(33);
        ll.insert(3);
        ll.insert(3003);
        ll.print();
    }

}
