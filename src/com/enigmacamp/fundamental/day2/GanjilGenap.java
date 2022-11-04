package com.enigmacamp.fundamental.day2;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input % 2 == 1){
            System.out.println("Ganjil");
        } else {
            System.out.println("Genap");
        }

        String result = input % 2 == 1? "Ganjil":"Genap";
        System.out.println(result);
    }
}
