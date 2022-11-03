package com.enigmacamp.fundamental.day2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        boolean condition = true;
        while (condition) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan Username:");
            String userInput = scanner.nextLine();
            System.out.print("Masukan Password:");
            String userPass = scanner.nextLine();
            String username = "enigma";
            String password = "camp";
            boolean isUsernameValid = username.equals(userInput);
            boolean isPasswordValid = password.equals(userPass);
            boolean loggedIn = isUsernameValid && isPasswordValid;

            if (loggedIn) {
                System.out.println("Welcome!");
                condition = false;
            }
                System.out.println("User atau password salah!");

        }
    }
}
