package com.company;

import java.util.Stack;

public class RemoveExtraBracketsInStacks {
    public static void main(String[] args) {
        String s="(((a+b)+(c+d)))";
        int l=s.length();
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println("true");   //true>>>>>means extra brackets present.
                    return;
                }
                else{
                    while(st.peek()!='(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        //if(st.peek()==0){
            System.out.println("false");   //false>>>>>>No any extra brackets found
       // }
       // else{
           // System.out.println("true");
       // }
    }
}
