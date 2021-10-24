package com.pb.beletskij.hw3;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Начало игры.\nОтгадай число в диапозоне 0 до 100");
        Scanner scan = new Scanner(System.in);
        int countAttempts = 0;
        int mysterious_figure = (int) (Math.random() * 100);
        boolean loop = true;


        //System.out.println(mysterious_figure);//загаданное число

        while (loop) {
            int custom_number;

            try {
                System.out.println("Введите Ваше число: ");
                custom_number = scan.nextInt();
                System.out.println(custom_number);
            } catch (Exception ex1) {
                System.out.println("Будь внимательнее! Это не число!");
                scan.nextLine();
                continue;
            }
            countAttempts++;
            if (custom_number > 100) {
                System.out.println("Число больше 100. Играем только в диапозоне от 0 - 100");
            }
            if (custom_number < 0) {
                System.out.println("Число отрицательное! Введите положительное число.");
            } else if (custom_number > mysterious_figure) {
                System.out.println("Не угадал! Загаданное число меньше!");

            } else if (custom_number < mysterious_figure) {
                System.out.println("Не угадал! Загаданное число больше!");
            } else if (custom_number == mysterious_figure) {
                loop = false;
                System.out.println("Число отгадано!\nКоличество твоих попыток= " + countAttempts);

            }

            if (loop) {
                System.out.println("Перестать играть. Введи: 'N' \n Продолжить. Введи любой символ");
                String ln;
                ln = scan.next();
                if (ln.equals("N")) {
                    loop = false;
                    System.out.println("Игра окончена.\nКоличество твоих попыток = " + countAttempts);
                } /*else if (ln.equals("Y")) {
                    loop = true;
                }
                else {
                    System.out.println("Вводишь непонятно что! Соберись!");

                }*/

            }
        }
    }
}




