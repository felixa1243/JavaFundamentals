package com.enigmacamp.fundamental.day2;

import java.util.Scanner;

public class JumlahGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int ganjil = 0,genap =0;
        for (int i = 0; i < input; i++) {
            if(i%2 == 1){
                ganjil+=i;
            }
        }
        for (int i = 0; i <= input*2 ; i+=2) {
            genap +=i;
        }
        System.out.println(ganjil);

        System.out.println(genap);
    }

}
