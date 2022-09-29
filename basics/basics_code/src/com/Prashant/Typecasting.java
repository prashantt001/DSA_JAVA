package com.Prashant;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int num = input.nextInt();  // alright
        // int num = input.nextFloat(); // error
        // float num = input.nextInt(); // alright
        //System.out.println(num);

        //Typecasting
//        int num = (int)(635.937);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a =258;
//        byte b = (byte)(a); // 258 % 256 = 2
//        System.out.println(b);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;  // since byte can't store 40*50,then how it's printing.Actually java promotes each byte to int
//        System.out.println(d);

//        byte b = 50;
//        b = b*3; // error

//        int a = 'A';
//        System.out.println(a); //prints 65. ascii value
//
        byte b = 43;
        char c = 'r';
        short s = 100;
        int i = 40;
        float f = 4.45f;
        double d = 4568.278;
        double result = (f*b) + (i/c) + (d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s) );
        // float + integer + double = double
        System.out.println(result);
    }

}
