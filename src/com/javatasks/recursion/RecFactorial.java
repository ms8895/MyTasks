package com.javatasks.recursion;

import java.util.Scanner;

public class RecFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int factorialLimit = scanner.nextInt();
        System.out.println(factorial(factorialLimit) + "!");

    }

    static int factorial(int i) {
        int result = 1;

        if (i == 0) {
            System.out.print(" = ");
            return result;
        }
        if (i == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(i);
        if (i != 2) {
            System.out.print(" * ");
        }

        result = i * factorial(i - 1);
        return result;
    }
}
