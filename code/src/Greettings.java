
package com.sahil;


import java.util.Scanner;

public class Greettings {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = in.next();
        String personlished=displey(name);
        System.out.println(personlished);
    }
    static String displey(String name){
        String message = "Hello "+name;

        return message;
    }

}
