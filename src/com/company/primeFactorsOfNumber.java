package com.company;

import java.util.Scanner;

public class primeFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        count(N);

    }

    public static void  count(int N){
        while (N%2==0){
            System.out.print(2+" ");
            N=N/2;
        }
        for(int i=3;i<=N;i=i+2){
            while(N%i==0){
                N=N/i;
                System.out.print(i+" ");
            }
        }

    }
}
