package com.pb.beletskij.hw4;
import java.util.Scanner;
public class CapitalLetter {
    private static String getString() {
        Scanner scan = new Scanner(System.in);
        String strUser = scan.nextLine();
        return strUser;
    }
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        String strNew = getString();
        char[] charArray = strNew.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;}
            } else {
                foundSpace = true;}
        }
        strNew = String.valueOf(charArray);
        System.out.println("Новый вид строки:\n" + strNew);
    }
}
