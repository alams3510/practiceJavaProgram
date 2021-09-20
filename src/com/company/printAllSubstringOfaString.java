package com.company;
import java.util.*;

public class printAllSubstringOfaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            for(int j=i+1;j<=l;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

}
