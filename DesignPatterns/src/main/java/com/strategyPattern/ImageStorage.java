package com.strategyPattern;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.Filtering(fileName);

    }
}
