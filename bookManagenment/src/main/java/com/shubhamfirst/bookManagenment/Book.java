package com.shubhamfirst.bookManagenment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private int bookId ;
    private String tittle;
    private String author;
    private int pages;

    public Book(int bookId, String tittle, String author, int pages) {
        this.bookId = bookId;
        this.tittle = tittle;
        this.author = author;
        this.pages = pages;
    }
}
