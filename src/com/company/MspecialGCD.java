package com.company;
import java.util.*;

import static com.company.gcdOftwoNumber.gcd;

public class MspecialGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k=n;
        int div = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                div = i;
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            n = n + div;
            if(gcd(n,k)==div){
                System.out.println(n+" " );
            }
            else{
                i--;
            }
        }
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
}
