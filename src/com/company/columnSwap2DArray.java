package com.company;

import java.util.Scanner;

public class columnSwap2DArray {
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
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n/2; j++) {
                int temp= a[i][j] ;
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=temp;
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
