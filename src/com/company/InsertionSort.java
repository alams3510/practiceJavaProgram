package com.company;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {15, 18, 5, 22, 90, 4};
        int l = a.length;
        for (int i = 1; i < l; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j]>temp; j--) {
                // if(a[j]>temp){
                a[j + 1] = a[j];
           // }

        }
            a[j + 1] = temp;
    }

        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
