package com.company;

public class SinglyLinkedList {
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
        }
        else{
            n.next=head;
            head=n;
        }
        size++;
    }
    public void append(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
        size++;
    }
    public void insert(int pos,int data){
        if(pos<=0 || pos>size+1){
            System.out.println("range is out of list");
        }
        else if(pos==1){
            push(data);
        }
        else if(pos==(size+1)){
            append(data);
        }
        else{
            Node n=new Node(data);
            Node temp=head;
            int current=1;
            while(current!=(pos-1)){
                temp=temp.next;
                current++;
            }
            n.next=temp.next;
            temp.next=n;
        }
        size++;
    }
    public void delete(int pos){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(pos<=0 || pos>size+1){
            System.out.println("range is out of list");
        }
        else {
            Node temp = head;
            if (pos == 1) {
                head = temp.next;
                temp.next = null;
            } else {
                int current = 1;
                while (current != pos - 1) {
                    temp = temp.next;
                    current++;
                }
                Node dN=temp.next;
                temp.next = dN.next;
                dN.next=null;
            }
            size--;
        }
    }
    public void traverse(){
        if(head!=null) {
            Node temp = head;
            while (temp!= null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }else{
            System.out.println("list is empty ");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.traverse();
        sll.push(4);
        sll.push(5);
        sll.push(6);
        sll.traverse();
        System.out.println("     size is: "+sll.size);

        sll.append(7);
        sll.append(8);
        sll.traverse();
        System.out.println("     size is: "+sll.size);

        sll.insert(3,10);
        sll.insert(3,15);
        sll.insert(0,40);
        sll.traverse();
        System.out.println("     size is: "+sll.size);

        sll.delete(4);
        sll.traverse();
        sll.delete(40);
        sll.traverse();
        System.out.println("     size is: "+sll.size);

    }
}
