package com.company;
//find a number in a sorted array???????????
public class binarySearchWithRecursion {
    public static void main(String[] args) {
        //for binary search Array must be in sorted order
        int a[]={12,34,45,65,83};
        int l=a.length;
       // binarySearchWithRecursion o=new binarySearchWithRecursion();
        int res=search(a,45, 0, a.length-1);
        if(res==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("value found at index  "+res);
        }
    }
    public static int search(int a[],int val,int start,int end){
        if(a.length==0 || start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(val==a[mid]){
            return mid;
        }
            if(val<a[mid]){
                return search(a,val,start,mid-1);
            }
            else {

                return search(a,val,mid+1,end);
            }
    }
}
