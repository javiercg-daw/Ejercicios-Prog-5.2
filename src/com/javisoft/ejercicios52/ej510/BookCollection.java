package com.javisoft.ejercicios52.ej510;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class BookCollection {
    private Book[] books;

    public BookCollection(int length) {
        this.books = new Book[length];
    }

    private int indexOf(Book book) {
        this.books = sorted(this.books);
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == book) {
                return i;
            }
        }
        return -1;
    }

    private boolean contains(Book book) {
        return this.indexOf(book) != -1;
    }

    private Book[] sorted(Book[] array) {
        Book[] newArray = new Book[array.length];
        int i = 0;
        for (Book b : array) {
            if (b != null) {
                newArray[i] = b;
                i++;
            }
        }
        return newArray;
    }

    private int firstEmptyIndex() {
        this.books = sorted(this.books);
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void addBook(Book book) {
        int firstNull = this.firstEmptyIndex();
        if (firstNull == -1 || this.contains(book)) {
            return;
        }

        this.books[firstNull] = book;
    }

    public void removeBookByAuthor(String author) {
        this.books = sorted(
                Arrays.stream(this.books)
                        .filter(Objects::nonNull)
                        .filter(b -> !(b.getAuthor().equals(author)))
                        .toArray(arr -> new Book[this.books.length])
        );
    }

    public void removeBookByTitle(String title) {
        this.books = sorted(
                Arrays.stream(this.books)
                        .filter(Objects::nonNull)
                        .filter(b -> !(b.getTitle().equals(title)))
                        .toArray(arr -> new Book[this.books.length])
        );
    }

    public void printBestAndWorst() {
        List<Book> bookList = Arrays.asList(this.books);
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

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        Arrays.stream(this.books).filter(Objects::nonNull).map(Book::toString).forEach(joiner::add);
        return joiner.toString();
    }


}