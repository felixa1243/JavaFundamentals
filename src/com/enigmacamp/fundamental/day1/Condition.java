package com.enigmacamp.fundamental.day1;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username:");
        String userInput = scanner.nextLine();
        System.out.print("Masukan Password:");
        String userPass = scanner.nextLine();
        String username = "enigma";
        String password =  "camp";
        boolean isUsernameValid = username.equals(userInput);
        boolean isPasswordValid = password.equals(userPass);
        boolean loggedIn = isUsernameValid && isPasswordValid;
        if(loggedIn){
            System.out.println("Welcome");

        } else if(!isUsernameValid&&!isPasswordValid) {
            System.out.println("Username dan password salah");
        } else if (!isUsernameValid) {
            System.out.println("Username salah!");
        } else if (!isPasswordValid) {
            System.out.println("Password salah!");
        }
        char grade = 'D';
        switch(grade){
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                 System.out.println("Cukup Baik");
                 break;
        case 'C':
            System.out.println("Kurang Baik");
            break;
        default:
            System.out.println("Nilai tidak terdaftar");
            break;
        }
    }

}
