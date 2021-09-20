package com.company;


public class mergeSort {
    public static void main(String[] args) {
        int a[]={5,8,15,2,7,65,48,22};
       // int l=0;
       // int h=a.length;
        sort(a,0,a.length-1);

    }
    public static void sort(int a[],int l,int h){
        if(l<h) {
            int m=(l+h)/2;

            sort(a, l, m);
            sort(a, m + 1, h);
            merge(a, l, m, h);

        }
    }
    public static void merge(int a[],int l,int m,int h){
        int i=l;
       // int n=a.length;
        int j=m+1;
        int k=l;
        int b[]=new int[a.length];
        while(i<=m && j<=h){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
       // if(i>m) {
            while (j <= h) {
                b[k] = a[j];
                k++;
                j++;
            }
      //  }else {
            while (i <= m) {
                b[k] = a[i];
                k++;
                i++;
            }
       // }
        for(int p=l;p<=h;p++){
            a[p]=b[p];
            System.out.print(a[p]+" ");
        }
       // print(a,0,a.length);
        System.out.println();

   // }
   // public static void print(int a[],int l,int h){
//        for(int p=l;p<=h;p++){
//            System.out.print(a[p]+" ");
//        }
//        System.out.println();
    }

}
