package com.company;
import java.util.*;

public class Array2D_Rotation {
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
            System.out.println("original array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            }
        System.out.println("rotated array by 90 degree");
        for(int i=0;i<m/2;i++) {
            for (int j = 0; j < n; j++) {
                int temp=a[i][j];
                a[i][j]=a[m-1-i][j];
                a[m-1-i][j]=temp;
            }
            System.out.println();
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
    }

