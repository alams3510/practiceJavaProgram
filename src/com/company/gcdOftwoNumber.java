package com.company;

import java.util.Scanner;

public class gcdOftwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if (b == 0||a==0) {
            return 0;        }
        if(a==b){
            return a;
        }

        if(a>b){
            return  gcd(a-b,b);
        }else{
            return gcd(b,b-a);
        }
    }
}
