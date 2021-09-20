package com.company;

public class numGreaterThanAllItsRights {
    public static void main(String[] args) {
        int a[]={14,15,8,9,5,2,45,78,25,15,2};
        int l=a.length;
        int max=Integer.MIN_VALUE;
        for(int i=l-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                System.out.print(max+" ");

            }
        }
        //System.out.print(a[l-1]);
    }
}
