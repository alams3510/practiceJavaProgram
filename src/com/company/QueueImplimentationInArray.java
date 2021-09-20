package com.company;

public class QueueImplimentationInArray {

    int front;
    int rear;
    int a[];
    int size;
    QueueImplimentationInArray(int data){
        size=data;
        front=-1;
        rear=-1;
        a=new int[size];
    }
    boolean isEmpty(){
        if(front==-1 && rear==-1 || front>rear ){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(rear==size-1){
            return true;
        }else{
            return false;
        }
    }
    void insert(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            if(front==-1 && rear==-1){
                front=rear=0;
            }
            else{
                rear=rear+1;
            }
            a[rear]=data;
        }
    }
   void  delete(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
       else{
           // System.out.println("deleted element is"+a[front]);
           front++;

        }
    }
    int size(){
        if(isEmpty()){
            return 0;
        }
       return rear-front+1;
    }
    void traverse(){
        if(isEmpty()){
            System.out.print("queue is empty ");
            return;
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplimentationInArray q=new QueueImplimentationInArray(3);
        System.out.println(q.size());
        q.insert(25);
        q.insert(55);
        q.insert(28);
       q.traverse();
        System.out.println(q.isEmpty());
        System.out.println(q.size());

           q.delete();
        System.out.println(q.size());
        q.traverse();

    }
}
