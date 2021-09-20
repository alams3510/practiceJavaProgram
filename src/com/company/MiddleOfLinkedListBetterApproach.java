package com.company;

public class MiddleOfLinkedListBetterApproach {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
   public void mid(){
        if(head==null){
            System.out.println("empty list");
            return ;
        }
        else{
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.print("mid element is "+slow.data);
        }
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
    }
    public static void main(String[] args) {
        MiddleOfLinkedListBetterApproach me=new MiddleOfLinkedListBetterApproach();
        me.append(40);
        me.append(30);
        me.append(10);
        me.append(80);
        me.append(70);
        me.mid();
    }
}
