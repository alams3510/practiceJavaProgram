package com.company;

public class FirstAndLastOccurenceInSortedArray {
    public static void main(String[] args) {
        int a[]={2,10,10,10,18,18,18,20};
        System.out.println("first index is "+Fsearch(a,18));
        System.out.print("last index is "+Lsearch(a,18));
    }
    public static int Fsearch(int a[],int num){
        int start=0;
        int end=a.length-1;
        int res=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (num == a[mid]) {
                 res = mid;
                end=mid-1;

            }
            else if (num > a[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
           // mid = start + (end - start) / 2;
        }
        return res;
    }
    public static int Lsearch(int a[],int num){
        int start=0;
        int end=a.length-1;
        int res=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (num == a[mid]) {
                 res = mid;
                start=mid+1;

            }
            else if (num > a[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
           // mid = start + (end - start) / 2;
        }
        return res;
    }
}
