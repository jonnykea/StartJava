package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.init();
        String exit = "false";
        do {
            bookshelf.actualize();
            showMenu();
            String item = console.next();
            switch (item) {
                case "1" -> bookshelf.printBooks();
                case "2" -> bookshelf.getNumberOfBooks();
                case "3" -> bookshelf.getFreeSpace();
                case "4" -> bookshelf.searchBook();
                case "5" -> bookshelf.addBook();
                case "6" -> bookshelf.removeBook();
                case "7" -> exit = "true";
                default -> System.out.println("Incorrect command " + item + " available commands : 1,2,3,4,5,6,7");
            }
        } while (exit.equals("false"));
    }

    public static void showMenu() {
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
}
