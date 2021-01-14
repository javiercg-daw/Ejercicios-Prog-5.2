package com.javisoft.ejercicios52.ej510;

public class Book {
    private final String title;
    private final String author;
    private final int pages;
    private double rating;

    public Book(String title, String author, int pages, double rating) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.rating = rating;

        if (this.rating > 10.0) {
            this.rating = 10.0;
        } else if (this.rating < 0.0) {
            this.rating = 0.0;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + " (" + author + "). " + pages + " pages. " + "Rating: " + rating;
    }
}
