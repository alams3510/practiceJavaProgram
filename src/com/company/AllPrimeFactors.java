package com.company;

public class AllPrimeFactors {
    public static void main(String[] args) {
        int n=4255;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n=n/i;

                }
                System.out.println(i);
            }


        }
    }
}
