package com.enigmacamp.fundamental.day1;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double r = scanner.nextFloat();
        double result = pi*Math.pow(r,2);
        System.out.println(result);
    }
}
