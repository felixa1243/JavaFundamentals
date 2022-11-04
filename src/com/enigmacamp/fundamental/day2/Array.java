package com.enigmacamp.fundamental.day2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String [] family;
        String [] Month = new String[12];
        String [] Days = {"Minggu","Senin","Selasa","Rabu","Kamis","Jum\'at","Sabtu"};
        String firstDay = Days[0];

        Integer [] numbers = new Integer[12];
        int dayCount = Days.length;
        for (String day:Days){
            System.out.println(day);
        }
        System.out.println(Arrays.deepToString(numbers));

    }
}
