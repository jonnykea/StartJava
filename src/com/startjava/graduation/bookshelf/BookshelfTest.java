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

    public void showMenu() {
        System.out.print("""
                                
                Press the number of command for execution:
                1 - Get a list of books which are on the bookshelf
                2 - Get the numbers of all books
                3 - Get free space on the bookshelf
                4 - Get the book by the title
                5 - Add the book on the bookshelf
                6 - Remove the book
                7 - If you want to leave this program
                                
                """);
    }

    public void run() {
        bookshelf.init();
        String exit = "false";
        do {
            showMenu();
            printBooks();
            String item = console.nextLine();
            switch (item) {
                case "1" -> printBooks();
                case "2" -> printNumberOfBooks();
                case "3" -> printFreeSpace();
                case "4" -> searchBook();
                case "5" -> addBook();
                case "6" -> removeBook();
                case "7" -> exit = "true";
                default -> System.out.println("Incorrect command " + item + " available commands : 1,2,3,4,5,6,7");
            }
        } while (exit.equals("false"));
    }

    private void printFreeSpace() {
        System.out.println("Numbers of empty cells - " + bookshelf.getFreeSpace());
    }

    private void printNumberOfBooks() {
        System.out.println("Numbers of all books - " + bookshelf.getNumberOfBooks());
    }

    private String getInput() {
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
            try {
                String enteredBook = getInput();
                String[] elementsOfBook = enteredBook.split(",");
                author = elementsOfBook[0];
                title = elementsOfBook[1];
                publishYear = elementsOfBook[2];
                Book newBook = new Book(author, title, publishYear);
                bookshelf.addBook(newBook);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Incorrect data input \n" + EXAMPLE);
            }
        } else {
            System.out.println("Bookshelf is overfilled!");
        }
    }

    private void removeBook() {
        System.out.println("""
                Write title of book that you want to remove
                example: War and Peace              
                """);
        String title = getInput();
        try {
            bookshelf.removeBook(title);
            System.out.println("book with " + title + " is removed");
        } catch (RuntimeException e) {
            System.out.println("Unable to delete - " + e.getMessage());
        }
    }

    private void searchBook() {
        System.out.println("""
                Write title of book that you want to search              
                """ + EXAMPLE);
        String title = getInput();
        Book book = bookshelf.searchBook(title);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book isn't found");
        }
    }

    private void printBooks() {
        var arrayBook = bookshelf.getBooks();
        System.out.print("Bookshelf consist of books: \n");
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.print("book number - " + (i + 1) + arrayBook[i] + "\n");
        }
    }
}

