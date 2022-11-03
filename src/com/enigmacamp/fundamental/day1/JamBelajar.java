package com.enigmacamp.fundamental.day1;

import java.util.Scanner;

public class JamBelajar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jam = scanner.nextInt();
        if(jam >= 8 && jam <=12 || jam >=14 && jam <=17){
            System.out.println("JAM BELAJAR");
        } else if (jam > 24 || jam < 0) {
            System.out.println("WAKTU HANYA 24 JAM.");
        } else {
            System.out.println("JAM ISTIRAHAT");
        }
    }
}
