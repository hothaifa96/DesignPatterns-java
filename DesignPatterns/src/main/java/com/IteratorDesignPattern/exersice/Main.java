package com.IteratorDesignPattern.exersice;

public class Main {
    public static void main(String[] args) {
        // build a cart class  to store products on the website
        // each the product is array of 2 fields -> [price , name] '[String,String]'
        //
        // the carts build as list of 4 items
        //
        //implement the iterator d.p and PTI principle to iterate over
        // the cart and print the product name and the price of it
        Cart cart = new Cart();
        cart.push(new Product("coffee","14"));
        cart.push(new Product("zero","9"));
        cart.push(new Product("horse","140000"));
        cart.push(new Product("car","200000"));
        cart.push(new Product("tooth paste","2"));

        Iterator iterator = cart.createIterator();

        while(iterator.hasNext()){
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }

    }
}
