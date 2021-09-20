package com.company;
import java.util.*;
public class IntersectionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int a1[]={4,2,3,5,4,2,3};
        int a2 []={9,1,7,2,4,2,1,2};
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        Intersect(a1,a2,s1,s2);
        System.out.print(s2);
    }
    public static void Intersect(int a1[],int a2[], Set<Integer>set1, Set<Integer>set2){
        for(int i=0;i<a1.length;i++){
            set1.add(a1[i]);
        }
        for(int i=0;i<a2.length;i++){
         if(set1.contains(a2[i])){
             set2.add(a2[i]);
         }
        }
    }
}
