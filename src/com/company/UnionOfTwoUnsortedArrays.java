package com.company;
import java.util.*;
public class UnionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int a1[]={4,2,3,5,4,2,3};
        int a2[]={9,1,7,2,4,2,1,2};
        Set<Integer>set=new HashSet<>();
        union(a1,a2,set);
        System.out.println(set);
    }
    public static void union(int a1[],int a2[], Set<Integer>set){
        for(int i=0;i<a1.length;i++){
            set.add(a1[i]);
        }
        for(int i=0;i<a1.length;i++){
            set.add(a2[i]);
        }
    }
}
