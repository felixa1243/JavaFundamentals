package com.enigmacamp.fundamental.day1;

import java.util.Scanner;

public class Balok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float  panjang = scanner.nextFloat();
        float lebar = scanner.nextFloat();
        float tinggi = scanner.nextFloat();
        float luas = 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
        float volume = panjang * lebar * tinggi;

        System.out.println(luas);
        System.out.println(volume);

    }
}
