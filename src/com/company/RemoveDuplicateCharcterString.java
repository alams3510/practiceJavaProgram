package com.company;

public class RemoveDuplicateCharcterString {
    public static void main(String[] args) {
        String s="abaabcgga";
        int l=s.length();
        String p="";
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(p.indexOf(ch)==-1){
                p=p+ch;
            }
        }
        System.out.println(p);
    }
}
