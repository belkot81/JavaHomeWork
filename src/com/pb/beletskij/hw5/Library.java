package com.pb.beletskij.hw5;

import java.util.Date;

public class Library {
    public static void main(String[] args) {
//библиотека книг
    Book [] books = {
            new Book("Приключения Иванова","Иванов И.И.","2000 г."),
            new Book("Словарь Сидорова","Сидоров А.В.","1980 г."),
            new Book("Энциклопедия Гусева","Гусев К.В. ","2010 г.")
    };
//список читателей
    Reader [] readers = {
            new Reader("Петросян В.В.",145,"МВЭД",new Date(System.currentTimeMillis()),809311120),
            new Reader("Мкртчан С.А.",258,"МЧМ",new Date(System.currentTimeMillis()),806716516),
            new Reader("Пельменидзе М.В.",637,"АИС",new Date(System.currentTimeMillis()),804654545)
    };

        System.out.println("Список книг: ");
        for (Book b:books){
        System.out.println(b.getBookName() + " - " + b.getBookAuthor() + " " + b.getBookYear() + ",");
    }
        System.out.println("Список читателей: ");
        for (Reader r:readers){
        System.out.println(r.getReedFio() + " " + r.getReadTicket() + " " + r.getReedFaculty() + " "+ r.getReedBirthday() + " " + r.getReedNumberPhone() + ",");
    }
        System.out.println("История книгооборота: ");

        for (Reader r:readers){    //перебираем читателей
        r.takeBook(books.length);
        r.returnBook(books.length);
        String [] names = new String[books.length];
        for (int i = 0; i < books.length; i++){
            names[i] = books[i].getBookName();
        }
        //сопоставляем имена с книгами
        r.takeBook(names);
        r.takeBook(books);
        r.returnBook(names);
        r.returnBook(books);

     }
    }
  }
