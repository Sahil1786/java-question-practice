package com.sahil.StringBuilder;

public class Performance {
    public static void main(String[] args) {
        String Serise="";
        for (int i = 0; i <26 ; i++) {
            char ch= (char)('a'+i);
           Serise=Serise+ch;

        }
        System.out.println(Serise);
    }
}
