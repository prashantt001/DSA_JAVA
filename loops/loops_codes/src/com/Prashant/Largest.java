package com.Prashant;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Find the largest of the three numbers?
        // first attempt
//        if (a>b){
//            if(a>c){
//                System.out.println(a);
//            }else{
//                System.out.println(c);
//            }
//        }else if(b>c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }

        // second attempt

//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
//        System.out.println(max);

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);


    }
}
