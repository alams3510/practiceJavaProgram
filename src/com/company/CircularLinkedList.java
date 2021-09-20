package com.company;

public class CircularLinkedList {
    int size;
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            n.next=n;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            n.next=head;
            head=n;
            temp.next=n;
        }
        size++;
    }
    public void traverse(){
        if(head==null){
            System.out.println("empty list");
        }
        else {
            Node temp=head;
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp!= head);

        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();

        cll.traverse();
        cll.push(10);
        cll.traverse();
        System.out.println(" size "+cll.size);

        cll.push(20);
        cll.traverse();
        System.out.println(" size "+cll.size);

        cll.push(30);
        cll.traverse();
        System.out.println(" size "+cll.size);
    }
}
