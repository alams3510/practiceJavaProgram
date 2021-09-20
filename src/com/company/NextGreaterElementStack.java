package com.company;
import java.util.*;
public class NextGreaterElementStack {
    public  static int [] NGE(int a[]) {
        int b[] = new int[a.length];
        Arrays.fill(b, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[st.peek()] < a[i]) {
                int p=st.pop();
                b[p] = a[i];
            }

            st.push(i);
        }
        return b;
      }

    public static void main(String[] args) {
        int a[]={4,2,6,8,1,0};
       int c[]= NGE(a);
       for(int i=0;i<a.length;i++){
           System.out.print(c[i]+" ");
       }
    }
}
