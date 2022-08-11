package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    static Scanner console = new Scanner(System.in);
    final static int NUM_OF_BOOKS = 10;
    int indexBookshelf;
    static Book[] books = new Book[NUM_OF_BOOKS];

    public Bookshelf (){
        init();
    }

    public void init() {
        books[indexBookshelf++] = new Book("Pushkin", "Fairy about Saltan's king", "1831");
        books[indexBookshelf++] = new Book("Lermantov", "Mciry", "1839");
        books[indexBookshelf++] = new Book("Jack London", "White Hang", "1906");
        books[indexBookshelf++] = new Book("Lev Tolstoy", "War and Peace", "1873");
    }

    public void actualization() {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                length++;
            }
        }
        Book[] temp = new Book[length];
        int j = 0;
        int i = 0;
        System.out.println("                                 Condition of the bookshelf ");
        while (i < books.length) {
            if (books[i] != null) {
                System.arraycopy(books, i, temp, j, 1);
                j++;
                System.out.print("book number - " + (i + 1) + temp[i] + "\n");
            }
            i++;
        }
        System.arraycopy(temp, 0, books, 0, length);
    }

    public void freeSpace() {
        int freeSpace = (NUM_OF_BOOKS) - indexBookshelf;
        System.out.println("Numbers of empty cells - " + freeSpace);
    }

    public void numberOfBooks() {
        System.out.println("Numbers of all books - " + (indexBookshelf));
    }

    public void set() {
        System.out.print("""
                Write book that you put on the bookshelf with ','\s
                example: Author,Title,Publish year
                """);
        String enteredBook = console.nextLine();
        String[] elementsOfBook = enteredBook.split(",");
        String author = elementsOfBook[0];
        String title = elementsOfBook[1];
        String publishYear = elementsOfBook[2];
        Book newBook = new Book(author, title, publishYear);
        books[indexBookshelf] = newBook;
        indexBookshelf++;
    }

    public void print() {
        Book[] arrayBook = Arrays.copyOf(books, indexBookshelf);
        System.out.print("Bookshelf consist of books: \n");
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.print("book number - " + (i + 1) + arrayBook[i] + "\n");
        }
    }

    public void searchBook() {
        System.out.println("""
                Write title of book that you want to search
                example: War and Peace
                """);
        String title = console.nextLine().toLowerCase();
        Integer index = getIndexByTitle(title);
        if (index != null) {
            System.out.println(books[index]);
        }
    }

    public void removeBook() {
        System.out.println("""
                Write title of book that you want to remove
                example: War and Peace
                """);
        String title = console.nextLine().toLowerCase();
        Integer index = getIndexByTitle(title);
        if (index != null) {
            books[index] = null;
            indexBookshelf--;
        }
    }

    private Integer getIndexByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            if (title.equals(books[i].getTitle().toLowerCase())) {
                return i;
            }
        }
        System.out.println("Book isn't found ");
        return null;
    }
}


