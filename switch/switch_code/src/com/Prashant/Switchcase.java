package com.Prashant;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

//        if (fruit.equals("mango")){
//            System.out.println("KiNG OF FRUIT");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("A SWEET RED FRUIT");
//        }

//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("round");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("round");
            default -> System.out.println("please enter a valid fruit");
        }
    }

}
