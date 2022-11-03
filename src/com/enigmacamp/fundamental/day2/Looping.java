package com.enigmacamp.fundamental.day2;

public class Looping {
    public static void main(String[] args) {
//        for(var i = 0; i < 10 ; i++){
//            System.out.println(i);
//        }
        for( var i = 5; i >=1;--i){
            for(var j = 1;j<=i;++j){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= 10; r++) {
            for (int sp = 1; sp <= 10 - r; sp++) {
                result.append(" ");
            }
            for (int c = 1; c <= (r * 2) - 1; c++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result);
    }
}