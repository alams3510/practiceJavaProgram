package com.company;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int a[]={1,2,5,7,6,10,3};
        int l=a.length;
        LinearSearchInArray o=new LinearSearchInArray();
        int res=o.search(a,10);
        if(res==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(res);
        }
    }
    public static int search(int a[],int val){
        for(int i=0;i<a.length;i++){
            if(a[i]==val){
                return i;
            }
        }
        return -1;
    }
}
