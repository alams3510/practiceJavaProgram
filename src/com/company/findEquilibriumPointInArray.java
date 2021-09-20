package com.company;

public class findEquilibriumPointInArray {
    public static void main(String[] args) {
        int a[]={1,6,7,0,7,7,2,1,4,7,5,2};
        int l=a.length;
        int sum=0,sum2=0;
        for(int i=0;i<l;i++){
            sum=sum+a[i];
        }
        for(int i=0;i<l;i++){
            sum=sum-a[i];
            if(sum==sum2) {
                System.out.println(i);
                break;
            }
           // if(sum>sum2){
                sum2=sum2+a[i];
           // }


        }
    }
}
