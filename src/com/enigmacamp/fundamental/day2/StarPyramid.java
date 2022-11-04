package com.enigmacamp.fundamental.day2;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        for (int i = input; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
