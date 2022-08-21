package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner console = new Scanner(System.in);
    private final Bookshelf bookshelf = new Bookshelf();
    static final private String EXAMPLE = "example: Author,Title,Publish year";

    public static void main(String[] args) {
        BookshelfTest bookshelfTest = new BookshelfTest();
        bookshelfTest.run();
    }

    public void run() {
        do {
            showMenu();
            printBooks();
            int item = Integer.parseInt(console.nextLine());
            switch (item) {
                case 1 -> searchBook();
                case 2 -> removeBook();
                case 3 -> addBook();
                case 4 -> printBooks();
                case 5 -> printNumberOfBooks();
                case 6 -> printFreeSpace();
                case 7 -> {
                    return;
                }
                default -> System.out.println("Incorrect command " + item + " available commands : 1,2,3,4,5,6,7");
            }
        } while (true);
    }

    public void showMenu() {
        System.out.print("""                           
                Press the number of command for execution:
                1 - Get the book by the title
                2 - Remove the book
                3 - Add the book on the bookshelf
                4 - Get a list of books which are on the bookshelf
                5 - Get the numbers of all books
                6 - Get free space on the bookshelf
                7 - If you want to leave this program                                
                """);
    }

    private void printBooks() {
        var books = bookshelf.getBooks();
        System.out.println("Bookshelf consist of books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("book number - " + (i + 1) + books[i]);
        }
    }

    private void searchBook() {
        System.out.println("""
                Write title of book that you want to search              
                """ + EXAMPLE);
        String title = getInputTittle();
        Book book = bookshelf.searchBook(title);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book isn't found");
        }
    }

    private void removeBook() {
        System.out.println("""
                Write title of book that you want to remove
                example: War and Peace              
                """);
        String title = getInputTittle();
        try {
            bookshelf.removeBook(title);
            System.out.println("book with " + title + " is removed");
        } catch (NullPointerException e) {
            System.out.println("Unable to delete - " + e.getMessage());
        }
    }

    private String getInputTittle() {
        String title;
        do {
            title = console.nextLine().toLowerCase();
            if (title.isEmpty()) {
                System.out.println("Incorrect data input");
            }
        } while (title.isEmpty());
        return title;
    }

    private void addBook() {
        if (!bookshelf.isFull()) {
            System.out.println("""
                    Write book that you put on the bookshelf with ','
                    """ + EXAMPLE);
            String author;
            String title;
            String publishYear;
            String enteredBook = getInputTittle();
            String[] elementsOfBook = enteredBook.split(",");
            if (elementsOfBook.length == 3) {
                author = elementsOfBook[0];
                title = elementsOfBook[1];
                publishYear = elementsOfBook[2];
                Book newBook = new Book(author, title, publishYear);
                bookshelf.addBook(newBook);
            } else {
                System.out.println("Incorrect data input \n" + EXAMPLE);
            }
        } else {
            System.out.println("Bookshelf is overfilled!");
        }
    }

    private void printNumberOfBooks() {
        System.out.println("Numbers of all books - " + bookshelf.getNumberOfBooks());
    }

    private void printFreeSpace() {
        System.out.println("Numbers of empty cells - " + bookshelf.getFreeSpace());
    }
}

