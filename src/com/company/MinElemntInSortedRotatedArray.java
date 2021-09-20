package com.company;

public class MinElemntInSortedRotatedArray {
    public static void main(String[] args) {
       // int a[]={4,5,6,7,8,0,1,3};
        int a[]={1,2,3,10,0};
       int p= minindex(a);
        System.out.println("index is  "+p);
    }
    public static int minindex(int a[]){
        int lo=0;
        int hi=a.length-1;
        if(a[lo]<=a[hi]){
            return lo;
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(a[mid]>a[mid+1]){
                return mid+1;
            }
            else if(a[mid]<a[mid-1]){
                return mid;
            }
            else if(a[lo]<=a[mid]){
                lo=mid+1;
            }
            else if(a[mid]<=a[hi]){
                hi=mid-1;
            }
//            else{
//                return a[0];
//            }
        }
        return -1;
    }
}
