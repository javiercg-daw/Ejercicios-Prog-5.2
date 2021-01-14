package com.javisoft.ejercicios52.ej510;

public class Ej510 {
    public static void main(String[] args) {
        BookCollection myCollection = new BookCollection(4);
        Book lotr = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1178, 11.0);
        Book harry = new Book("Harry Potter", "J. K. Rowling", 123, 4.5);

        myCollection.add(lotr);
        myCollection.add(harry);

        myCollection.removeBookByAuthor("J. K. Rowling");
        myCollection.removeBookByTitle("The Lord of the Rings");

        myCollection.add(lotr);

        System.out.println(myCollection.toString());
    }
}
