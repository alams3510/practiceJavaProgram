package com.company;

public class StackImplimentationUsingArray {
    int st[];
    int size;
    int top;
    StackImplimentationUsingArray(int n){
        size=n;
        st=new int[size];
        top=-1;
    }
    public boolean isFull() {
//        boolean result;
//        if(top==size-1){
//             result=true;
//        }
//        else{
//            result=false;
//        }
//        return result;
//    }
         return (top == size - 1);
     }
        public boolean isEmpty() {
//        boolean result;
//        if(top==-1){
//             result=true;
//        }
//        else{
//            result=false;
//        }
//        return result;
//    }
             return (top == -1);
         }

         public void push(int n){
          if(isFull()){
              System.out.println("stack is Full");
          }
          else{
             top=top+1;
             st[top]=n;
            //  st[++top]=n;
          }
         }
         public int pop(){
        if(isEmpty()){
            return top;
        }
        else{
//            int value=st[top];
//            top=top-1;
//            return value;
            return st[top--];

        }
         }
         public int peek(){
           if(isEmpty()){
               return top;
           }
           else{
               return st[top];
           }
         }
       //  void display(){

        // }

    public static void main(String[] args) {
        StackImplimentationUsingArray s=new StackImplimentationUsingArray(5);
        s.push(25);
        s.push(85);
        s.push(855);
        s.push(851);
        s.push(8);
        s.push(8);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}
