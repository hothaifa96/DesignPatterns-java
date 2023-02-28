package com.behavioral.IteratorDesignPattern.exersice;

public class Cart {
    private Product[] cart = new Product[4];
    private int index;

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

    public void push(Product product){
        cart[index] = product;

        index = ++index % 4;
    }
    public Product[] getCart() {
        return cart;
    }
}
