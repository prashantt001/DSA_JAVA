package com.Prashant;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till user doesn't press X or x
        int answer = 0;
        while(true){
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                System.out.println();

                if (op == '+'){
                    answer = num1+num2;
                }
                if (op == '-'){
                    answer = num1-num2;
                }
                if (op == '*'){
                    answer = num1*num2;
                }
                if (op == '/'){
                    if (num2!=0) {
                        answer = num1 + num2;
                    }
                }
                if (op == '%'){
                    answer = num1%num2;
                }

            }else if (op == 'X' || op == 'x'){
                break;
            }else {
                System.out.println("Invalid operation");
            }
            System.out.println(answer);
        }

    }
}
