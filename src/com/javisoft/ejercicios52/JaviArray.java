package com.javisoft.ejercicios52;


import com.javisoft.ejercicios52.ej510.Book;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class JaviArray<T> {

    private T[] array;

    @SuppressWarnings(value = "unchecked")
    public JaviArray(int length) {
        this.array = (T[]) new Object[length];
    }

    private int indexOf(T item) {
        this.sort();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    private boolean contains(T item) {
        return this.indexOf(item) != -1;
    }


    @SuppressWarnings(value = "unchecked")
    private void sort() {
        T[] newArray = (T[]) new Object[this.array.length];
        int i = 0;
        for (T item : array) {
            if (item != null) {
                newArray[i] = item;
                i++;
            }
        }
        this.array = newArray;
    }

    private int firstEmptyIndex() {
        this.sort();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private int size() {
        int firstNull = this.firstEmptyIndex();
        return (firstNull == -1) ? this.array.length : (firstNull - 1);
    }

    public boolean add(T item) {
        int firstNull = this.firstEmptyIndex();
        if (firstNull == -1 || this.contains(item)) {
            return false;
        }

        this.array[firstNull] = item;
        return true;
    }


    @SuppressWarnings(value = "unchecked")
    public boolean remove(T item) {
        if (!this.contains(item)) {
            return false;
        }
        this.array = Arrays.stream(this.array)
                .filter(Objects::nonNull)
                .filter(b -> b != item)
                .toArray(arr -> (T[]) new Object[this.array.length]
                );
        this.sort();
        return true;
    }

    @SuppressWarnings(value = "unchecked")
    public void removeItemByProperty(Predicate<? super T> lambda) {
        this.array = Arrays.stream(this.array)
                .filter(Objects::nonNull)
                .filter(lambda)
                .toArray(arr -> (T[]) new Object[this.array.length]);
        this.sort();
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        Arrays.stream(this.array).filter(Objects::nonNull).map(T::toString).forEach(joiner::add);
        return joiner.toString();
    }

}
