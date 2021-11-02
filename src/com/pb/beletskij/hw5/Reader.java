package com.pb.beletskij.hw5;
import java.util.Date;

public class Reader {
    private String reedFio;
    private int readTicket;
    private String reedFaculty;
    private Date reedBirthday;
    private int reedNumberPhone;

    public Reader() {

    }

    public Reader(String reedFio, int readTicket, String reedFaculty, Date reedBirthday, int reedNumberPhone) {
        this.reedFio = reedFio;
        this.readTicket = readTicket;
        this.reedFaculty = reedFaculty;
        this.reedBirthday = reedBirthday;
        this.reedNumberPhone = reedNumberPhone;
    }

    public String getReedFio() {
        return reedFio;
    }

    public void setReedFio(String reedFio) {
        this.reedFio = reedFio;
    }

    public int getReadTicket() {
        return readTicket;
    }

    public void setReadTicket(int readTicket) {
        this.readTicket = readTicket;
    }

    public String getReedFaculty() {
        return reedFaculty;
    }

    public void setReedFaculty(String reedFaculty) {
        this.reedFaculty = reedFaculty;
    }

    public Date getReedBirthday() {
        return reedBirthday;
    }

    public void setReedBirthday(Date reedBirthday) {
        this.reedBirthday = reedBirthday;
    }

    public int getReedNumberPhone() {
        return reedNumberPhone;
    }

    public void setReedNumberPhone(int reedNumberPhone) {
        this.reedNumberPhone = reedNumberPhone;
    }

    public void takeBook(Integer count){
        System.out.println("\n" + reedFio +" взял:" + count + " книги");
    }

    public void takeBook(String... namebooks) {
        System.out.print( this.reedFio +" взял книги :");
        for (String bookName : namebooks) {
            System.out.print(bookName + ",");
        }
        System.out.println();
    }
    public void takeBook(Book... namebooks) {
        System.out.print( this.reedFio +" взял книги :");
        for ( Book book : namebooks) {
            System.out.print(book.getBookName()+"( "+ book.getBookAuthor()+" " + book.getBookYear()+"),");
        }
        System.out.println();
    }
    public void returnBook(Integer count){
        System.out.println(reedFio + " вернул:" + count + " книги"); ;
    }
    public void returnBook(String... namebooks) {
        System.out.print( this.reedFio +" вернул книги :"); ;
        for (String bookName : namebooks) {
            System.out.print(bookName +",");
        }
        System.out.println("");
    }
    public void returnBook(Book... namebooks) {
        System.out.print( this.reedFio +" вернул книги :"); ;
        for ( Book book : namebooks) {
            System.out.print(book.getBookName()+"( "+ book.getBookAuthor()+" " + book.getBookYear()+"),");
        }
    }
}
