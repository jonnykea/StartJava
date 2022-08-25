package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final static int NUM_OF_BOOKS = 10;
    private int bookCount;
    private final Book[] books = new Book[NUM_OF_BOOKS];

    public Bookshelf() {
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

    public void removeBook(String title) {
        int index = findIndex(title);
        if (index < 0) {
            throw new IllegalArgumentException("Book isn't found");
        }
        bookCount--;
        System.arraycopy(books, index + 1, books, index, bookCount - index);
        books[bookCount] = null;
    }

    public void addBook(Book newBook) {
        books[bookCount++] = newBook;
    }

    public int getNumberOfBooks() {
        return bookCount;
    }

    public int getFreeSpace() {
        return NUM_OF_BOOKS - bookCount;
    }

    public boolean isFull() {
        return bookCount >= 10;
    }

    private int findIndex(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (title.equals(books[i].getTitle().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}