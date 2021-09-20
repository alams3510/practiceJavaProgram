package com.company;
import java.util.*;
public class maxHeap {
    int size;
    int maxSize;
    int a[];

    maxHeap(int n){
       this. size=0;
      this.  maxSize=n;
        a=new int[maxSize];
    }
    // now creating max heap
    public void insert(int element){    //this logic is o(nlogn) ,which can be further optimized as heapify method o(n)
        a[size]=element;
        int temp=size;

            int parent = (temp - 1) / 2;
            while (a[temp] > a[parent]) {
                int p = a[temp];
                a[temp] = a[parent];
                a[parent] = p;
                temp = parent;
                parent = (temp - 1) / 2;
            }
            size++;
        }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        maxHeap max=new maxHeap(20);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int element=sc.nextInt();
            max.insert(element);
        }
        max.print();
    }
}
