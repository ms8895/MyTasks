package com.javatasks.arrays;

import java.util.Scanner;

public class Arra {
    public static void main(String[] args) {
        String str = "Андрей";
        char[] newChar = str.toCharArray(); //переводим строку в массив
        System.out.println(newChar);
        for (int i = newChar.length - 1; i >= 0; i--) {//Обращаемся к последнему элементу по его индексу
            System.out.print(newChar[i]);//Выводит последний элемент
        }
        //Вывод заранее готового массива строк
        System.out.println();
        String[] newString = {"Андрей", "Иван", "Николай"};
        //System.out.println(newString.length);
        for (int i = 0; i < newString.length; i++) {//Выводит элементы сначала, поочередно
            System.out.print(newString[i] + " ");
        }
        //Вывод заранее готового массива строк с конца
        System.out.println();
        for (int i = newString.length - 1; i >= 0; i--) {//Выводит элементы сначала, поочередно
            System.out.print(newString[i] + " ");
        }
        //Вывод заранее готового массива с числами
        System.out.println();
        int[] newInt = {2, 5, 6, 8, 15};
        for (int i = 0; i < newInt.length; i++) {//Выводит элементы сначала, поочередно
            System.out.print(newInt[i] + " ");
        }
        //Вывод заранее готового массива с числами с конца
        System.out.println();
        for (int j = newInt.length - 1; j >= 0; j--) {//Выводит элементы с конца
            System.out.print(newInt[j] + " ");
        }

        //Массив с использованием ввода
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пять чисел");
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Следующее число:");
            arrays[i] = sc.nextInt();
        }
        //Выводит полученный массив
        System.out.println();
        System.out.println("Полученный массив:");
        for (int j = 0; j < arrays.length; j++) {
            System.out.print(arrays[j] + " ");
        }
        //Выводит полученный массив в обратном порядке
        System.out.println();
        System.out.println("Массив в обратном порядке:");
        for (int k = arrays.length - 1; k >= 0; k--) {
            System.out.print(arrays[k] + " ");
        }
    }
}
