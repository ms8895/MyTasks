package com.javatasks.string;

public class Splitting {
    public static void main(String[] args) {
        String a = "A_volunteer_is_worth_twenty_pressed_men";

        String[] b = a.split("_");
        for (int i = 0; i< b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
