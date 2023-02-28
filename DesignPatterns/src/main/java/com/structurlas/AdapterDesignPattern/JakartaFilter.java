package com.structurlas.AdapterDesignPattern;

public class JakartaFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("jakarta filter is On");
    }
}
