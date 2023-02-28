package com.structurlas.AdapterDesignPattern;

import com.structurlas.AdapterDesignPattern.VintageFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        // Image
        // Filter inteface
        // jakarta filter
        var imageView = new ImageView(new Image());
        var jakarta = new JakartaFilter();
        imageView.apply(jakarta);
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
