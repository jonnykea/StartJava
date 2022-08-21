package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final static int NUM_OF_BOOKS = 10;
    private int indexBookshelf;
    private final Book[] books = new Book[NUM_OF_BOOKS];

    public Bookshelf() {
        init();
    }
    public void init() {
        books[indexBookshelf++] = new Book("Pushkin", "Fairy about Saltan's king", "1831");
        books[indexBookshelf++] = new Book("Lermantov", "Mciry", "1839");
        books[indexBookshelf++] = new Book("Jack London", "White Hang", "1906");
        books[indexBookshelf++] = new Book("Lev Tolstoy", "War and Peace", "1873");
    }

    private void actualize() {
        int length = 0;
        for (Book book : books) {
            if (book != null) {
                length++;
            }
        }
        Book[] temp = new Book[length];
        int j = 0;
        int i = 0;
        while (i < books.length) {
            if (books[i] != null) {
                System.arraycopy(books, i, temp, j, 1);
                j++;
            }
            i++;
        }
        System.arraycopy(temp, 0, books, 0, length);
    }

    public int getFreeSpace() {
        return NUM_OF_BOOKS - indexBookshelf;
    }

    public int getNumberOfBooks() {
        return indexBookshelf;
    }

    public boolean isFull() {
        return indexBookshelf >= 10;
    }

    public void addBook(Book newBook) {
        if (!isFull()) {
            books[indexBookshelf++] = newBook;
        } else {
            throw new NumberFormatException("Bookshelf is overfilled!");
        }
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, indexBookshelf);
    }

    public Book searchBook(String title) {
        Integer index = getIndexByTitle(title);
        if (index != null) {
            return books[index];
        }
        return null;
    }

    public void removeBook(String title) {
        Integer index = getIndexByTitle(title);
        if (index == null) {
            throw new NullPointerException("Book isn't found");
        }
        books[index] = null;
        indexBookshelf--;
        actualize();
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
        return null;
    }
}


