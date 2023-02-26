package com.strategyPattern;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void Filtering(String fileName) {
        System.out.println("Black and White filtering . . . ");
    }
}
