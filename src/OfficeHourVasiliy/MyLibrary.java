package OfficeHourVasiliy;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class MyLibrary {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        book1.title = "The Little Prince";
        book1.author = "Antoine de Saint-Exupéry";
        book1.pageCount = 70;
        book2.title = "War and Peace";
        book2.author = "Leo Tolstoy";
        book2.pageCount = 1225;
        book1.printInfo();
        System.out.println("##################");
        Book[] myCollection = new Book[]{book1, book2, book3, book4};
        for (Book b : myCollection) {
            b.printInfo();
        }
        for (Book b : myCollection) {
            System.out.println("Author: "+b.author);
        }
        ArrayList<Book> myCollectionList = new ArrayList<>();
        myCollectionList.add(book1);
        myCollectionList.add(book2);
        myCollectionList.add(book3);
        myCollectionList.add(book4);
    }
}
