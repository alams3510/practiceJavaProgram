package com.company;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={15,18,5,22,90,4};
        int l=a.length;
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
