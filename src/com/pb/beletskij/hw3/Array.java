package com.pb.beletskij.hw3;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int[] arraySort = array;
        int sumElements = 0;
        int countElements = 0;
        boolean loop = true;
        String enterInt ;

        while (loop) {
            System.out.println("Наполните массив элементами. Укажите 10 целых чисел: ");
            try {
                for (int i = 0; i < array.length; i++) {
                    enterInt = input.next();
                    array[i] = Integer.parseInt(enterInt.trim());
                    loop = false;
                }
            } catch (Exception ex1) {
                System.out.println("Элемент массива указан неверно! Попробуйте ещё раз!");
                //input.nextLine();
                loop = true;
                continue;
            }
        }
        System.out.print ("Сформированный масив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.print ("\n");
        int sortMas;
        for (int i = arraySort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arraySort[j] > arraySort[j + 1]) {
                    sortMas = arraySort[j];
                    arraySort[j] = arraySort[j + 1];
                    arraySort[j + 1] = sortMas;
                }
            }
        }
        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < arraySort.length; i++) {
            System.out.print (" " + arraySort[i]);
        }
        System.out.print ("\n");
        for (int i = 0; i < array.length; i++) {
            sumElements = sumElements + array[i];
            if (array[i] > 0) countElements++;
        }
        System.out.print ("Сумма элементов массива: " + sumElements + "\n");
        System.out.print ("Количество положительных элементов массива: " + countElements + "\n");
    }
}
