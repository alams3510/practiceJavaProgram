package com.company;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int a[]={2,2,2,3,3,4,6};
        int b[]={1,2,4,4,6,6,6,7,8,9};
        List<Integer> l=new ArrayList<>();
        union(a,b,l);
        System.out.print(l);
    }
    public static void union(int a[],int b[],List<Integer>list){
        int l1=a.length;
        int l2=b.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            while((i<l1-1) && a[i]==a[i+1]){
                i++;
            }
            while((j<l2-1) && b[j]==b[j+1]){
                j++;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                list.add(a[i]);
                i++;j++;
            }
        }
    }
}
