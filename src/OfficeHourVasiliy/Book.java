package OfficeHourVasiliy;

public class Book {
    String author;
    String title;
    int pageCount;
    public void printInfo() {
        System.out.println("Author: " + author + ", " +
                "Title: " + title + ", " +
                "Page count: " + pageCount);
    }
}
