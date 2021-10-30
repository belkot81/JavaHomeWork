package com.pb.beletskij.hw4;
import java.util.Scanner;

public class Anagram {

    private static int getCount(char[] str, int counter) {
        for (int i = 0; i < str.length; i++) {
            char leters = str[i];
            if (Character.isLetter(leters)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int counter_1 = 0;

        System.out.println("Введите первую строчку:");
        char[] str = scan.nextLine().toCharArray();

        System.out.println("Введите вторую строчку:");
        char[] str1 = scan.nextLine().toCharArray();


        counter = getCount(str, counter); //знаки припинания в строке 1
        counter_1 = getCount(str1, counter_1); //знаки припинания в строке 2

        //сравним сроки
        if  (counter != counter_1) {
            System.out.println("Не получиться, длина строк разная!");
        } else {

            int lettersFound = 0;
            char[] lettersMass = new char[counter];

            //проверка символов на количество вхождений в строках
            for(int i = 0; i < counter; i++){
                char symb = str[i];
                if(!Character.isLetter(symb)){
                    continue;
                }

                if(!lettersMass.equals(symb)){
                    lettersMass[lettersFound] = symb;
                    lettersFound ++;
                    int countStrOne = 0;
                    int countStrTwo = 0;
                    for(int y=0; y < str.length; y++){
                        if(str[y] == symb){
                            countStrOne++;
                        }
                    }
                    for(int y = 0; y < str1.length; y++){
                        if(str1[y] == symb){
                            countStrTwo++;
                        }
                    }
                    if(countStrOne == countStrTwo){
                    }else{
                        System.out.println("Это не анаграмма!");
                        return;
                    }
                }
            }
            System.out.println("Всё верно! Это Анаграмма.");
        }
    }


}
