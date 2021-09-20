package com.company;

public class maxSumOfKsizeWindow {
    public static void main(String[] args) {
        int a[]={3,2,5,4,1};
        int k=3;
       int p= maxsum(a,3);
        System.out.println(p);
    }
    public static int maxsum(int a[],int k){
        int sum=0;
        int n=a.length;
        for(int i=0;i<k;i++){
            sum=sum+a[i];
        }
        int msum=sum;
        int start=0;
        for(int i=k;i<n;i++) {
            sum = sum + a[i] - a[start];
            start++;
            if (sum > msum) {
                msum = sum;
            }
        }
        return msum;
    }
}
