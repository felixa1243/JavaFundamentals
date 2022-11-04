package com.enigmacamp.fundamental.day2;

public class Irisan {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,6};
        Integer [] anotherNumbers = {4,5,6,7,8,9,10};
        /* taruh code disini*/
        for (Integer num:numbers) {
            for (Integer num1:anotherNumbers
                 ) {
                if(num1 == num){
                    System.out.println(num1);
                }
            }
        }
    }
}
