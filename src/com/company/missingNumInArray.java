package com.company;

public class missingNumInArray {
    public static void main(String[] args) {
        int a[]={2,4,1,3,6,7,8};
        //we to add +1, becoz the missing elemrnt has 1 space in array
        int n=a.length+1;
        System.out.print (mising(a,n));
    }
    static int mising(int a[],int n){
        int l=a.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<l;i++){
            if(sum>a[i]){
                sum=sum-a[i];

            }
            else{
                sum=a[i]-sum;
            }
        }
        return sum;
    }
}
