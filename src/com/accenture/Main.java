package com.accenture;

import com.accenture.book.*;

import java.util.LinkedList;

//Creating an online shopping cart with different items
public class Main {

    public static void main(String[] args){
        SchoolBook schoolBook = new SchoolBook("Java for beginners", "Its a long book", 20.00, 5);
        FreeBook freeBook = new FreeBook("Java for noobs", "Get rekt by Java kid");
        PayBook payBook = new PayBook("Python is king", "Become a god", 35.00);

        BookCatalog bc = new BookCatalog();

        bc.addBook(schoolBook);
        bc.addBook(freeBook);
        bc.addBook(payBook);

        LinkedList<Book> bookList = bc.search("1", Book.SEARCH_ID);

        for(Book book : bookList){
            System.out.println(book.toString());
        }
        //System.out.println(schoolBook.toString());
        //System.out.println(freeBook.toString());
        //System.out.println(payBook.toString());
    }
}
