package com.javatasks.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int factorialLimit = scanner.nextInt();
        fact(factorialLimit);
    }

    static void fact(int factorialLimit) {
        int factorial = 1;
        if (factorialLimit < 0) {
            System.out.println("Факториал не рассчитывается для отрицательных чисел, перезапустите программу");
        } else if (factorialLimit == 0 || factorialLimit == 1) {
            System.out.println("Факториал " + factorialLimit + "! = 1");
            System.out.println("Финальный факториал " + factorialLimit + "! = 1");
        } else if (factorialLimit > 1) {
            for (int i = 1; i <= factorialLimit; i++) {//Рассчет нерекурсивного факториала
                factorial *= i;
                System.out.println("Факториал " + i + "! = " + factorial);//Выводит текущий факториал и его значение
            }
            System.out.println("Финальный факториал " + factorialLimit + "! = " + factorial); // Выводит факториал для запрашиваемого числа
        }
    }
}
