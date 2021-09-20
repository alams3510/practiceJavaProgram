package com.company;
import java.util.*;
public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[]={2,2,2,3,3,4};
        int b[]={1,2,4,4,6,6,6,7,8,9};
        List<Integer> l=new ArrayList<>();
        union(a,b,l);
        System.out.print(l);
    }
    public static void union(int a[],int b[],List<Integer>list){
       int l1=a.length;
       int l2=b.length;
        int i=0,j=0;
        while(i<l1 && j<l2) {
            while ((i < a.length - 1) && (a[i] == a[i + 1])) {
                i++;
            }
            while ((j < b.length - 1) && (b[j] == b[j + 1])) {
                j++;
            }
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                list.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<l1){
            if((i<l1-1) && a[i]==a[i+1]){
                i++;
            }
            else{
               list.add(a[i++]);
            }
        }
        while(j<l2){
            if((j<l2-1) && b[j]==b[j+1]){
                j++;
            }
            else{
               list.add(b[j++]);
            }
        }

    }
}
