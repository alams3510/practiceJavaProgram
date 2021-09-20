package com.company;
import java.util.*;

public class multiplication2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row colum size of first array");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("enter row colum size of 2nd array");

        int r2=sc.nextInt();
        int c2 =sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        System.out.println("enter row colum elements of first array");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter row colum elements of 2nd array");

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("multiplication array");
        if(c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    c[i][j]=0;
                    for(int k=0;k<c1;k++){
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
           }
        }
    }

