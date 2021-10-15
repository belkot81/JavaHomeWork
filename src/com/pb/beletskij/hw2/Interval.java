package com.pb.beletskij.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int interVal = 0;
        System.out.println("Введите число от 1 до 100: ");
        try {
            interVal = scan.nextInt();
        } catch (Exception ex1) {
            System.out.println("Ошибка!!! Это не число!");
            return;
        }
        if (interVal < 0){
            System.out.println("Число отрицательное!");
        }
        else if (interVal >= 0 && interVal <= 14){
            System.out.println("Ваше число в диапазоне от 0 до 14");
        }
        else if (interVal > 14 && interVal <= 35){
            System.out.println("Ваше число в диапазоне от 15 до 35");
        }
        else if (interVal > 35 && interVal <= 50){
            System.out.println("Ваше число в диапазоне от 36 до 50");
        }
        else if (interVal > 50 && interVal <= 100){
            System.out.println("Ваше число в диапазоне от 51 до 100");
        }
        else System.out.println("Вы ввели число больше 100!");
    }
}
