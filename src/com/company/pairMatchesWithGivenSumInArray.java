package com.company;
import java.util.*;
public class pairMatchesWithGivenSumInArray {
    public static void main(String[] args) {
        //3 methods to solve this
        //  1>>>brute force method,2>>>>sorting technique, 3>>>hash set method
        int a[] = {12, 5, 5, 1, 9};
        // Brute_method(a,10);
        // sort_method(a, 10);
        set_method(a,10);

    }

    static void Brute_method(int a[], int target) {
        int l = a.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (a[i] + a[j] == target) {

                    System.out.println("pair is present = " + i + " ," + j);
                }
            }
        }
    }

    static void sort_method(int a[], int target) {
        Arrays.sort(a);
        int l = a.length;

        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int end = a.length - 1;
        int start = 0;
        while (start <= end) {
            if (a[start] + a[end] > target) {
                end--;
            } else if (a[start] + a[end] < target) {
                start++;
            } else {
                System.out.println("pair is present at = " + start + " ," + end);
                start++;
                end--;
            }
        }
    }

    static void set_method(int a[], int target) {
    Set<Integer> s=new HashSet<>();
        int l = a.length;

        for(int i=0;i<l;i++){
        if(s.contains(target-a[i])){
            System.out.println("element is present at index =" +i);
        }
        else{
            s.add(a[i]);
        }
    }
        //System.out.println("not present");
    }
}
