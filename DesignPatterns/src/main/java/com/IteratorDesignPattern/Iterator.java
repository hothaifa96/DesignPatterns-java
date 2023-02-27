package com.IteratorDesignPattern;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}