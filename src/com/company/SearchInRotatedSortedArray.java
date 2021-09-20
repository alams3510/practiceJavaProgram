package com.company;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int a[]={4,5,6,7,1,2,3};
       int p= search(a,1);
        System.out.println("element is at index "+p);
    }
    public static int search(int a[],int target){
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[lo]<=a[mid]){
                if(target >=a[lo] && a[target]<=a[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else if(a[mid]<=a[hi]){
                if(target >a[mid] && a[target]<=a[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}
