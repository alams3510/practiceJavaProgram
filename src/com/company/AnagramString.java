package com.company;

import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(anagram(s1, s2));
    }
    public static boolean anagram(String s1,String s2) {

        if (s1.length() == s2.length()) {
            int count[] = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }

            }
            return true;
        }
        return false;

    }
}
