package com.company;
import java.util.*;
import com.sun.source.doctree.SeeTree;

public class firstRepeatingValueInArray {
    public static void main(String[] args) {
        int a[]={2,3,4,4,2,3,5,7};
        System.out.print( repeat(a));
    }
    public static int repeat(int a[]){
        Set<Integer> s=new HashSet<>();
        int l=a.length;
       int firstrepeat=0;
        //to get 1st repeated value we need to itirate from last to get 1st
        for(int i=l-1;i>=0;i--){
            if(s.contains(a[i])){
                firstrepeat=a[i];
            }
            else{
                s.add(a[i]);
            }
        }
        return firstrepeat;
    }
}
