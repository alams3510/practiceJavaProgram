package com.company;
import java.util.*;
public class BinarySearch2 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int a[] = {22, 45, 55, 88, 105};
        int item = 105;
        int start = 0;
        int end = a.length-1;
        int mid = (start + end) / 2;
        while (start<=end) {
            if (a[mid] == item) {
                System.out.println("number found at index " + mid);
                break;
            } else if (item < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
    }
}
