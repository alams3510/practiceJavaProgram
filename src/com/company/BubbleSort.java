package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={15,18,5,22,90,4};
        int l=a.length;
        for(int i=0;i<l-1;i++){
            int flag=0;
            for(int j=0;j<l-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
            break;
            }
        }

        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
