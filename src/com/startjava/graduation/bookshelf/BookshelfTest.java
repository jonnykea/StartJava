package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String command;
        Bookshelf bookshelf = new Bookshelf();
        do {
            bookshelf.actualization();
            instruction();
            command = console.next();
            switch (command) {
                case "1" -> bookshelf.print();
                case "2" -> bookshelf.numberOfBooks();
                case "3" -> bookshelf.freeSpace();
                case "4" -> bookshelf.searchBook();
                case "5" -> bookshelf.set();
                case "6" -> bookshelf.removeBook();
                default -> System.out.println("Incorrect command " + command + " available commands : 1,2,3,4,5,6");
            }
            bookshelf.actualization();
        } while (isNext());
    }
    private static boolean isNext() {
        System.out.println("\nDo you want to execute any commands ? Write yes или no... ");
        String answer = console.next().toLowerCase();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                return true;
            }
            System.out.println("Incorrect command. Write yes или no...");
            answer = console.next().toLowerCase();
        }
        return false;
    }

    public static void instruction() {
        String instruction = """
                
                Press the number of command for execution:
                1 - Get a list of books which are on the bookshelf
                2 - Get the numbers of all books
                3 - Get free space on the bookshelf
                4 - Get the book by the title
                5 - Add the book on the bookshelf
                6 - Remove the book
                """;
        System.out.print(instruction);
    }
}
