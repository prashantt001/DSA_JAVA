package com.Prashant;

public class CountNum {
    public static void main(String[] args) {
        int n = 2343536;
        int count = 0;

        while(n>0){
            int rem = n%10;
            if (rem==3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }

}
