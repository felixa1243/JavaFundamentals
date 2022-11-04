package com.enigmacamp.fundamental.day2;

public class Method {
    public static void main(String[] args) {
        String iqbal = sayHello("rajiph","Bandung");
        System.out.println(iqbal);
        System.out.println(foo());
    }
    static String sayHello(String firstname,String city){
        return "Hello enigma "+firstname+" i'm from "+city;
    }
    static String foo(){
        for (int i = 0; i <10; i++) {
            if(i == 5) {
                return "End";
            }
                System.out.println(i);
        }
        return "Finish";
    }
}
