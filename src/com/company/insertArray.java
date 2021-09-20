package com.company;

public class insertArray {
    int count=0;
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int pos=3;
        int val=100;
       insertArray o=new insertArray();
        o.insert(a,pos,val);
       o.insertAtStart(a,50);

    }
    public static void insert(int a[],int pos,int val){
        int l=a.length;
        for(int i=l-1;i>pos;i--){
            a[i]=a[i-1];
            a[pos]=val;
          //  System.out.print(a[i]+" ");
        }
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void insertAtStart(int a[],int val){
        int l=a.length;
        for(int i=l-1;i>0;i--) {
            a[i] = a[i - 1];
        }
            a[0]=val;
            //  System.out.print(a[i]+" ");

        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
