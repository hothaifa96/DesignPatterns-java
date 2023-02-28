package com.behavioral.IteratorDesignPattern.exersice;

public class Product {
    private String name;
    private String price;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String[] getProduct(){
        return new String[]{name,price};
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
