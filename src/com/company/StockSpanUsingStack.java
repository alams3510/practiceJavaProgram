package com.company;
import java.util.*;
public class StockSpanUsingStack {

    public static void main(String[] args) {
        int a[]={100,80,60,70,60,75,85};
       int p[]= span(a);
       for(int i=0;i<a.length;i++){
           System.out.print(p[i]+" ");
       }

    }
            public static int[] span(int a[]){
            int b[]=new int[a.length];
            Stack<Integer>st=new Stack<>();
            st.push(0);
            b[0]=1;
            for(int i=1;i<a.length;i++){
                while(!st.isEmpty() && a[st.peek()]<=a[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    b[i]=i+1;
                }
                else{
                    b[i]=i-st.peek();
                    st.push(i);
                }
            }
            return b;
            }
}
