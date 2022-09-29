package com.Prashant;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q: Print numbers from 1 to 10
        /*
            Syntax of for loops:
            for(initialisation; condition; increment/decrement){
              // body
             }
         */
//        for (int num = 1; num<=10; num++){
//            System.out.println(num);
//        }

        // print numbers from 1 to n
//        System.out.print("Please enter a number: ");
//        int n = input.nextInt();
//         for(int num = 1; num<=n; num++){
//             System.out.println(num);
//         }

        /*
         syntax of while loops:
         while(condition){
            //body
         }
         */
//        int num = 1;
//        while(num<=10){
//            System.out.println(num);
//            num++;
//        }

        // do while loop
        /*
        syntax :
        do {
        }while (condition);
         */

        int n = 1;
        do {
            System.out.println(n);
        }while (n != 1);

    }
}
