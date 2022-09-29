package com.Prashant;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
//        System.out.println(ch);
//         String s = "Hello";
//        System.out.println(s.charAt(2));

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
}
