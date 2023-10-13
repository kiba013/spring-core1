package com.course.springcourse.book;

public class ReadingBook {

    private Book book;

    public ReadingBook(Book book) {
        this.book = book;
    }

    public void readBook() {
        System.out.println(book.getBook());
    }
}
