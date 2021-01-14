package com.javisoft.ejercicios52.ej510;

import com.javisoft.ejercicios52.JaviArray;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BookCollection {
    private JaviArray<Book> books;

    public BookCollection(int length) {
        this.books = new JaviArray<>(length);
    }

    public void removeBookByAuthor(String author) {
        books.removeItemByProperty(book -> book.getAuthor().equals(author));
    }

    public void removeBookByTitle(String title) {
        books.removeItemByProperty(book -> book.getTitle().equals(title));
    }

    public void add(Book book) {
        books.add(book);
    }

    public void printBestAndWorst() {
        List<Book> bookList = Arrays.asList(this.books.toArray());
        if (bookList.isEmpty()) {
            return;
        }

        Book best = bookList.get(0);
        Book worst = bookList.get(0);
        for (Book book : bookList) {
            if (book == null) {
                continue;
            }
            if (book.getRating() < worst.getRating()) {
                worst = book;
            } else if (book.getRating() > best.getRating()) {
                best = book;
            }
        }
        System.out.println("Best:\t" + best.toString() + "\nWorst:\t" + worst.toString());
    }

    public String toString() {
        return this.books.toString();
    }

}
