package com.strategyDesignPattern;

public class JpgCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("compressing using jpg");
    }
}
