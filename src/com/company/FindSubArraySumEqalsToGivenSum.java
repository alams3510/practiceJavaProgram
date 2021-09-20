package com.company;

public class FindSubArraySumEqalsToGivenSum {
    public static void main(String[] args) {
        int a[]={4,2,5,3,1,8};
        subarray(a,9);
    }
    public static void subarray(int a[],int sum){
        int i=0,j=0;
        int l=a.length;
        int wsum=0;
        while(j<l){
            wsum=wsum+a[j];
            if(wsum==sum){
                System.out.println("index is " +i+","+j);
               // return;
            }
            while(wsum>sum && i<=j){
                wsum=wsum-a[i];
                i++;
                if(wsum==sum){
                    System.out.println("index is "+i+","+j);
                   // return;
                }
            }
            j++;
        }
    }
}
