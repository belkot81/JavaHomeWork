package com.pb.beletskij.hw9;

import java.io.*;

public class FileNumbers {
    private static void createNumbersFile() throws IOException {
        Writer writer = new FileWriter("files/numbers.txt");
        for (int i = 1; i < 101; i++) {
            int q = (int) (Math.random() * 100);
            try {
                writer.write(String.valueOf(q));
                if (i % 10 == 0) {
                    writer.write("\n");
                } else {
                    writer.write(" ");
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        writer.close();
    }

    private static void createOddNumbersFile ()throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("files/numbers.txt"));
        Writer writer = new FileWriter("files/odd-numbers.txt");
        for(int i=0;i<10;i++) {
            String line = reader.readLine();
            String[] array = line.split(" ");
            for (int u = 0; u < 10; u++) {
                Integer q = Integer.parseInt(array[u]);
                if (q % 2 == 0) {
                    writer.write("0");
                } else {
                    writer.write(String.valueOf(q));
                }
                writer.write(" ");
            }

            writer.write("\n");
        }
        writer.close();
        reader.close();
    }

    public static void main(String[] args) {
        try {
            createNumbersFile();
            System.out.println("Файл numbers.txt создан");
            createOddNumbersFile();
            System.out.println("Файл odd-numbers.txt создан");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
