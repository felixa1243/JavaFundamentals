package com.enigmacamp.fundamental.day2;

public class WordCount {
    public static void main(String[] args) {
        String kata = "I Love Coding";
        System.out.println(hitungKata(kata));
        String aku1 = "I Love Enigma Camp";
        System.out.println(hitungKata(aku1));
    }
    static int hitungKata(String a){
        if(a.length()<1) return 0;
        int count = 1;
        for (int i = 0; i <a.length() ; i++) {
            if (a.toCharArray()[i] == ' ') {
                count++;
            }
        }
        return count;
    }
}
