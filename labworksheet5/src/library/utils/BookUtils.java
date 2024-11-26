package library.utils;

import library.books.FictionBook;

public class BookUtils {
    public static void PrintBookDetails(FictionBook book){
        System.out.println("Book Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());

    }
}
