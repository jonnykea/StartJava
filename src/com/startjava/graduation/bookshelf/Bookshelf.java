package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final static int NUM_OF_BOOKS = 10;
    private int bookCount;
    private final Book[] books = new Book[NUM_OF_BOOKS];

    public Bookshelf() {
        init();
    }

    public void init() {
        books[bookCount++] = new Book("Pushkin", "Fairy about Saltan's king", "1831");
        books[bookCount++] = new Book("Lermantov", "Mciry", "1839");
        books[bookCount++] = new Book("Jack London", "White Hang", "1906");
        books[bookCount++] = new Book("Lev Tolstoy", "War and Peace", "1873");
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, bookCount);
    }

    public Book searchBook(String title) {
        int index = findIndex(title);
        if (index > 0) {
            return books[index];
        }
        return null;
    }

    private int findIndex(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            if (title.equals(books[i].getTitle().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public void removeBook(String title) {
        int index = findIndex(title);
        if (index < 0) {
            throw new IllegalArgumentException("Book isn't found");
        }
        books[index] = null;
        bookCount--;
        actualize();
    }

    private void actualize() {
        for (int i = 0; i <= bookCount; i++) {
            if (books[i] == null) {
                books[i] = books[i + 1];
                books[i + 1] = null;
            }
        }
        System.arraycopy(books, 0, books, 0, bookCount);
    }

    public void addBook(Book newBook) {
        if (!isFull()) {
            books[bookCount++] = newBook;
        } else {
            throw new NumberFormatException("Bookshelf is overfilled!");
        }
    }

    public boolean isFull() {
        return bookCount >= 10;
    }

    public int getNumberOfBooks() {
        return bookCount;
    }

    public int getFreeSpace() {
        return NUM_OF_BOOKS - bookCount;
    }
}


