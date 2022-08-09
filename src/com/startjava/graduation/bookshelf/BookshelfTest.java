package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.init();
        printPoem();
        String command = console.next();
        switch (command) {
            case "1":
                bookshelf.print();
            case "2":

            case "3":

            case "4":
            case "5":
                bookshelf.set();
            case "6":
            default:
                System.out.println("Incorrect command " + command + " available commands : 1,2,3,4,5,6");
        }



        bookshelf.print();
    }

    public static void printPoem() {
        String poem = """
            ’Press number of digit for information:
            1 - Get list of books which are on the bookshelf
            2 - Get numbers of all books
            3 - Get free space on the bookshelf
            4 - Get book by the title
            5 - Add book on the bookshelf
            6 - Remove book
            """;
        System.out.print(poem);
    }
}
