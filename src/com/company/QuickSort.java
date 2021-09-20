package com.company;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={45,12,88,2,33,52,55};
        QuickSort o=new QuickSort();
        o. print(a);
        o.QuickSort(a,0,a.length-1);
        o. print(a);
    }
    static void QuickSort(int a[],int lb,int ub){
        //int loc;
        if(lb<ub) {

            int loc=partition(a,lb,ub);

            QuickSort(a, lb, loc - 1);
            // }if(loc<end){
            QuickSort(a,loc+1,ub);

        }

    }
    public static int partition(int a[],int lb,int ub){
        int start=lb;
        int end=ub;
        int pivot=a[lb];
        int temp;
        while(start<end){
            while(a[start]<=pivot && start<end ){
                start++;
            }
            while(a[end]>pivot && end>=0){
                end--;
            }
            if(start<end){
                temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }

        }
         temp=a[end];
       a[end]=a[lb];
        a[lb]=temp;
        return end;
    }

    void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
