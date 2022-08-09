package com.startjava.graduation.bookshelf;

public class Book {
   private final String author;
   private final String titleOfBook;
   private final String yearOfPublish;

    @Override
    public String toString() {
        return " : Author - " + author + ", " + "title - " + titleOfBook + ", " +
                "year of publish - " + yearOfPublish;
    }

    public Book (String author, String titleOfBook, String yearOfPublish){
        this.author = author;
        this.titleOfBook = titleOfBook;
        this.yearOfPublish = yearOfPublish;
    }
}
