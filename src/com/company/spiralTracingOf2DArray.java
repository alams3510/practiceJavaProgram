package com.company;
import java.util.*;

public class spiralTracingOf2DArray {
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
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ") ;
            }
            System.out.println();
        }
        System.out.println("our spiral numbers are \n  ");
        int k=0,i;
        int lastrow=m-1;
        int l=0;
        int lastcol=n-1;
        while(k<=lastrow&&l<=lastcol){
            for(i=l;i<=lastcol;i++){
                System.out.print(a[k][i]+" ");
            }
            k++;
            for(i=k;i<=lastrow;i++){
                System.out.print(a[i][lastcol]+" ");
            }
            lastcol--;
            if(l<=lastcol) {
                for (i = lastcol; i >= l; i--) {
                    System.out.print(a[lastrow][i] + " ");
                }

                lastrow--;
            }
            if(k<=lastrow) {
                for (i = lastrow; i >= k; i--) {
                    System.out.print(a[i][l] + " ");
                }

                l++;
            }
        }
    }
}
