package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    static Scanner console = new Scanner(System.in);
    final static int NUM_OF_BOOKS = 10;
    static int indexBookshelf = 0;

    @Override
    public String toString() {
        return "Bookshelf{}";
    }

    static Book[] bookShelf = new Book[NUM_OF_BOOKS];

    public void init() {
        bookShelf[indexBookshelf++] = new Book("Pushkin", "Fairy about Saltan's king", "1831");
        bookShelf[indexBookshelf++] = new Book("Lermantov", "Mciry", "1839");
        bookShelf[indexBookshelf++] = new Book("Jack London", "White Hang", "1906");
        bookShelf[indexBookshelf++] = new Book("Lev Tolstoy", "War and Peace", "1873");
    }

    public void set() {
        System.out.print("Напишите книгу, которую хотите добавить через ',' " +
                "\nпример: Автор,Название,Год\n");
        String enteredBook = console.nextLine();
        String[] elementsOfBook = enteredBook.split(",");
        String author = elementsOfBook[0];
        String titleOfBook = elementsOfBook[1];
        String yearOfPublish = elementsOfBook[2];
        Book newBook = new Book(author, titleOfBook, yearOfPublish);
        bookShelf[indexBookshelf] = newBook;
        indexBookshelf++;
    }

    public void print() {
        Book[] arrayBook = Arrays.copyOf(bookShelf, indexBookshelf);
        System.out.print("Bookshelf consist of books: \n");
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.print("book number - " + (i + 1) + arrayBook[i] + "\n");
        }
    }
}



