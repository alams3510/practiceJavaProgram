package com.company;

import java.util.Scanner;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter value to find");
        int x=sc.nextInt();
        int row=0;
        for(int i=0;i<n;i++){
            if(a[i][0]==x){
                System.out.println("yes");
                break;
            }
            else if(a[i][0]>x){
                row=i-1;
            }
            else{
                row=i;
            }
        }
        int flag=0;
        if(row>=0){
            for(int i=0;i<m;i++){
                if(a[row][i]==x){
                    flag=1;
                }

            }

        }
        if(flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }


    }
}
