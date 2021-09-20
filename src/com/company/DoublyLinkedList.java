package com.company;

public class DoublyLinkedList {
    int size;
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
           prev=next=null;
        }
    }
    public void push(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
        size++;
    }
    public void traverse(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void append(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
        }
        size++;
    }
    public void insert(int pos,int data){
        Node n =new Node(data);
        if(pos<=0 || pos>size+1){
            System.out.println("range is beyond the list");
        }
        else {
            if (pos == 1) {
                push(data);
            }
            else if (pos == size + 1) {
                append(data);
            }
            else {
                Node temp=head;
                int current=1;
                while (current != pos - 1) {
                    temp = temp.next;
                    current++;
                }
                n.next = temp.next;
                temp.next = n;
                n.next.prev = n;
                n.prev = temp;
                size++;
            }
        }
    }
    public void delete(int pos){
        Node temp=head;
        int current=1;
        if(head==null){
            System.out.println("cant delete due to empty list");
        }
        else if(pos<=0 || pos>size){
            System.out.println("size is beyond the limit");
        }
        else {
            Node dN=head;
            if (pos == 1) {
                 temp=temp.next;
                 head=dN.next;
                 temp.prev=null;
                 dN.next=null;
            }
            else {
                while (current != pos - 1) {
                    temp = temp.next;
                    current++;
                }
                if (pos == size) {
                    dN = temp.next;
                    temp.next = null;
                    dN.prev = null;
                } else {
                    dN = temp.next;
                    temp.next = dN.next;
                    dN.next.prev = temp;
                    dN.next = null;
                    dN.prev = null;
                }
            }
            size--;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.traverse();
        dll.push(15);
        dll.push(20);
        dll.push(25);
        dll.traverse();
        System.out.println("  size is : "+dll.size);

        dll.append(40);
        dll.append(50);
        dll.append(60);
        dll.traverse();
        System.out.println("  size is : "+dll.size);

        dll.insert(4,80);
        dll.traverse();
        dll.insert(0,220);
        dll.traverse();
        dll.insert(6,890);
        dll.traverse();
        System.out.println("  size is : "+dll.size);

        dll.delete(5);
        dll.traverse();
        System.out.println("  size is : "+dll.size);
        dll.delete(1);
        dll.traverse();
        System.out.println("  size is : "+dll.size);
        dll.delete(6);
        dll.traverse();
        System.out.println("  size is : "+dll.size);

    }

}
