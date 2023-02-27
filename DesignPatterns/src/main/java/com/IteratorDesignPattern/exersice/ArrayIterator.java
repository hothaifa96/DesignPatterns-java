package com.IteratorDesignPattern.exersice;

public class ArrayIterator implements Iterator{
    private Cart cart ;
    private int index;

    public ArrayIterator(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean hasNext() {
        return index < cart.getCart().length;
    }

    @Override
    public Product current() {
        return cart.getCart()[index];
    }

    @Override
    public void next() {
        index++;
    }
}
