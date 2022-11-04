package com.enigmacamp.fundamental.day3;

public class Member {
    public static void main(String[] args) {
     String [][] Members = {
             {"Jack","1234124"},
             {"Milla","0298123"},
             {"Roberto","12134"}
     };

        for(var number: Members){
            System.out.printf("Name:"+number[0]);
        }
    }
}
