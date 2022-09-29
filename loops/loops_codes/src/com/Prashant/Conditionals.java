package com.Prashant;

public class Conditionals {

    public static void main(String[] args) {
	/*
      Syntax for if loop:
	  if (Boolean expression T or F){
	     //body
	  }else {
	     // do this
	  }
     */

        int salary = 25300;
        if(salary > 40000){
            salary = salary + 2000; // salary += 2000
        }else if(salary > 20000){
            salary = salary + 5000;
        }else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
