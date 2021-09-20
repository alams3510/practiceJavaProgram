package com.company;

public class smallestSubArrayWithMinLength {
    public static void main(String[] args) {
        int a[]={10,3,2,5,5,5,5,3,2,5,1,1,1,2};
        //int sum=10;
        System.out.print( wsize(a,10));
    }
    public static int wsize(int a[],int sum){
        int count=0;
        int p=sum;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            sum=sum-a[i];
            count++;
            if(sum==0){
                if(count<=min){
                    min=count;
                    sum=p;
                    count=0;

                }
            }
        }
        return min;
    }
}
