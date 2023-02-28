package com.behavioral.IteratorDesignPattern.exersice;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
