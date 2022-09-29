package com.Prashant;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter integer value: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " +rollno);
    }
}
