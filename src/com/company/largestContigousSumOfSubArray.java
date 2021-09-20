package com.company;

public class largestContigousSumOfSubArray {
    public static void main(String[] args) {
        //by kadens algorithm>>>>>>>>>o(n)
        int a[]={-3,-4,4,-1,-2,1,5,-3};
        int csum=0;     //c>>>>current
        int msum=0;     //m>>max
        for(int i=0;i<a.length;i++){
            csum=csum+a[i];
            if(csum>msum){
                msum=csum;
            }
            if(csum<0){
                csum=0;
            }
        }
        System.out.println(msum);
    }
}
