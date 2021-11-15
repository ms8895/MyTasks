package com.javatasks.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sr.nextInt();
        System.out.println("Рекурсия " + fib(a));
        System.out.println("Цикл " + fib2(a));
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else if (n >= 49) {
            System.out.println("Введите число мменьше 48");
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int fib2(int n) {
        if(n >= 49){
            System.out.println("Введите число мменьше 48");

        }
        int first = 0;
        int second = 1;
        int result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}

