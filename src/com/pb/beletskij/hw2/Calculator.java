package com.pb.beletskij.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operand1 = 0;
        int operand2 = 0;
        String sign;
        int rezults;

        System.out.println("Введите первое число: ");
        try {
            operand1 = scan.nextInt();
        } catch (Exception ex1) {
            System.out.println("Ошибка!!! Это не число!");
            return;
        }
        System.out.println("Введите второе число: ");
        try {
            operand2 = scan.nextInt();
        } catch (Exception ex2) {
            System.out.println("Ошибка!!! Это не число!");
            return;
        }
        System.out.println("Укажите действие: ");
        sign = scan.next();

        switch (sign) {

            case "+":
                rezults = operand1 + operand2;
                System.out.println("Результат вычисления = " + rezults);
                break;
            case "-":
                rezults = operand1 - operand2;
                System.out.println("Результат вычисления = " + rezults);
                break;
            case "*":
                rezults = operand1 * operand2;
                System.out.println("Результат вычисления = " + rezults);
                break;
            case "/":
                try {
                    rezults = operand1 / operand2;
                } catch (ArithmeticException ex3) {
                    System.out.println("Ошибка!!! На 0 делить нельзя!");
                    return;
                }
                System.out.println("Результат = " + rezults);
                break;
            default:
                System.out.println("Ошибка!!! Неверный знак действия!");
        }
    }
}