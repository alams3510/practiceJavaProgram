package com.company;

public class pairsSumEqualToGivenSumInArray {
    public static void main(String[] args) {
        int a[]={1,2,4,6};
        int l=a.length;
        int sum=7;
        int i=0;
        int j=l-1;
        //while(i<j){
            while(a[i]+a[j]>sum){
                j--;
            }
            while(a[i]+a[j]<sum){
                i++;
            }

                if(a[i]+a[j]==sum){
                System.out.println(i+" "+j);
            }
        }
    }

