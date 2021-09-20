package com.company;

import java.util.*;
// k largest elements given by users input directly using min heap of k size
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        int a[]={10,7,11,5,27,8,9,45};
        int k=3;
        for(int i=0;i<a.length;i++){
            System.out.println(m.minheap(a[i],k));
        }
    }
    public int minheap(int num ,int k){
        PriorityQueue <Integer> min=new PriorityQueue<>();
        {
           if (min.size() < k) {
               min.add(num);

           } else if (num > min.peek()) {
               min.poll();
               min.add(num);
           }
       }
        return min.peek();

    }


}



