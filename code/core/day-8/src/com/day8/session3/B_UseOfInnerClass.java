package com.day8.session3;
class LinkList{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    Node first, last;
    LinkList(){
        first=last=null;
    }
    public void addNode(int data){
        Node temp=new Node(data);
        if(first==null){
            first=temp;
            last=temp;
            //first.next=last;
        }else {
            last.next=temp;
            last=temp;
        }
    }
    public void addFirst(int data){
        Node temp=new Node(data);
        if(first==null){
            first=last=temp;
        }else {
            temp.next=first;
            first=temp;
        }
    }

    public void addLast(int data){
        Node temp=new Node(data);
        if(first==null){
            first=last=temp;
        }else {
           last.next=temp;
           last=temp;
        }
    }
    //660 -> 550
    public void addAfter(int target, int data){

    }

    public void print(){
        System.out.println("data of LL");
        if(first==null){
            System.out.println("No data");
            return;
        }else {
            Node temp=first;
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
        }
    }
}


public class B_UseOfInnerClass {
    public static void main(String[] args) {

        LinkList list=new LinkList();
        list.addNode(66);
        list.addNode(6);
        list.addNode(660);
        list.addNode(6996);
        list.addNode(6);

        list.addLast(70089);


        list.print();


    }
}
