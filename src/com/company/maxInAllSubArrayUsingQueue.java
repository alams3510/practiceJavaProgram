package com.company;
import java.util.*;
public class maxInAllSubArrayUsingQueue {
    public static void main(String[] args) {
        int a[]={2,5,4,3,1,7};
        int k=3;
        max(a,k);
    }
    public static void max(int a[],int k){
        Deque<Integer>d =new LinkedList<Integer>();
        int i;
        for( i=0;i<k;i++){
            while(!d.isEmpty() && a[i]>a[d.peekLast()]){
                d.removeLast();
            }
            d.addLast(i);
        }
        for(;i<a.length;i++){
            System.out.print(a[d.peek()]+" ");
            while(!d.isEmpty() && i-k>=d.peek()){
                d.removeFirst();
            }
            while(!d.isEmpty() && a[i]>a[d.peekLast()]){
                d.removeFirst();
            }
            d.addLast(i);
        }
        System.out.print(a[d.peek()]);
    }
}
