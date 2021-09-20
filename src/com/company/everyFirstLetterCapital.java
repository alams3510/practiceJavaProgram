package com.company;

public class everyFirstLetterCapital {
    public static void main(String[] args) {
        String s= "md shahbaz alam";
        s=" "+s;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                a[i+1]=(char)(a[i+1]-32);
                i++;
            }

            // return;
        }
        System.out.print(a);

    }
}
