package com.Prashant;

import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String department = input.next();

        switch (empid){

            case 1 :
                System.out.println("Prashant");
                break;
            case 2 :
                System.out.println("Rahul");
                break;
            case 3 :
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
                break;
            default :
                System.out.println("Enter correct id");

        }

    }
}
