package com.behavioral.IteratorDesignPattern;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}