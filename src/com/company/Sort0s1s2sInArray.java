package com.company;

public class Sort0s1s2sInArray {
    public static void main(String[] args) {
        int a[]={0,1,1,0,2,2,1,0,0};
         sort(a);
         print(a);
    }
    public static void sort(int a[]){
        int low=0;
        int mid=0;
        int high=a.length-1;
        while(mid<=high){
            switch(a[mid]){
                case 0:
                    if(a[mid]!=a[low]){
                        int temp=a[mid];
                        a[mid]=a[low];
                        a[low]=temp;
                    }
                    low++;mid++;break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if(a[mid]!=a[high]){
                        int temp=a[mid];
                        a[mid]=a[high];
                        a[high]=temp;
                    }
                    high--;
            }
        }
    }
    static void print(int a[]){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
    }
}
