package com.company;

public class DeleteArrayElement {
    static int count=6;
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,};
        DeleteArrayElement o=new DeleteArrayElement();
        o.print(a);
       // o.deleteEnd(a);
       // o.print(a);
       // o.deleteVal(a,5);
       // o.print(a);
        o.deletePos(a,41);
        o.print(a);
    }
    public static void deleteEnd(int []a){
        if(a.length<=0){
            return;
        }
        count--;
    }
    public static void print(int []a){
        for(int i=0;i<count;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void deleteVal(int []a,int val){
        int i;
        for(i=0;i<count;i++){
            if(a[i]==val) {
                break;
            }
        }
        if(i==count){
            System.out.println("value not found");
            return;
        }
        for(int j=i;j<count-1;j++){
            a[j]=a[j+1];
        }
        count--;
    }
    public static void deletePos(int a[],int pos){
        if(pos>count || pos<0){
            System.out.println("invalid position");
            return;
        }
        for(int i=pos-1;i<count-1;i++){
            a[i]=a[i+1];
        }
        count--;
    }

}
