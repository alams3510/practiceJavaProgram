package com.company;

public class maxMultipleOfTwoNumInArray {
    public static void main(String[] args) {
        int a[]={-4,2,3,-10,4,-15,3,6};
        System.out.println(maxmult(a));
    }
    public static int maxmult(int a[]) {
        int m1 = a[0], m2 = a[1];
        int s1 = a[0], s2 = a[1];
        int i;
        for ( i = 2; i < a.length; i++) {
            if (a[i] > m1) {
                m2 = m1;
                m1 = a[i];
            }
            //}
            //for (int i = 2; i < a.length; i++) {
            if (a[i] < s1) {
                s2 = s1;
                s1 = a[i];
            }
        }
        int max1 = m1 * m2;
        int max2 = s1 * s2;
        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }
}}

