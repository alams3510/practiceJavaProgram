package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class booleanMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

            int m=sc.nextInt();
            int n=sc.nextInt();
            int array[][]=new int[m][n];

            for (int p=0;p<m;p++){

                for(int q=0;q<n;q++){

                    array[p][q]=sc.nextInt();
                }
            }

            for (int p=0;p<m;p++){

                for(int q=0;q<n;q++){
                    if (array[p][q]==1){
                        Arrays.fill(array[p],1);
                    }
                }

            }
        for (int p=0;p<m;p++){

            for(int q=0;q<n;q++) {
                System.out.print(array[p][q] + " ");
            }
            System.out.println();

        }


    }

    }

