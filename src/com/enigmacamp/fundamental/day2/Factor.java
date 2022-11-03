package com.enigmacamp.fundamental.day2;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.println(i );
            }
        }
    }
}
